#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct Alumno{
	char nombre[20];
	int edad;
	float promedio;
	char sexo;

	struct Alumno *sig;
};

struct Alumno *creaNodo();
void insertaNodo(struct Alumno *lista, struct Alumno *nodo);
void muestraLista(struct Alumno *lista);

void cortaycarga(char *cadena, struct Alumno *alumno);

int main(){
	
	FILE *fp;
	char cadena[100];

	struct Alumno *fi, *lista, *temp;

	fp = fopen("alumnos.txt", "r");

	if(fp == NULL){

		printf("No existe el archivo");
		return 1;
	}


	lista = creaNodo();
	while(!feof(fp)){
		fi = creaNodo();
		fscanf(fp,"%s\n",cadena);
		cortaycarga(cadena, fi);
		insertaNodo(lista, fi);
		printf("\nNodo insertado\n");
	}

	temp = lista->sig;
	muestraLista(temp);



}

struct Alumno *creaNodo(){
	struct Alumno *nodo;
	nodo = (struct Alumno *)malloc(sizeof(struct Alumno));
	nodo->sig = NULL;
	return nodo; 
}

void insertaNodo(struct Alumno *lista, struct Alumno *nodo){
	nodo->sig = lista->sig;
	lista->sig = nodo;
}

void muestraLista(struct Alumno *lista){
	struct Alumno *temp;
	temp = lista;
	while(temp != NULL){
		printf("%s tiene %d annos y un promedio de %f\n", temp->nombre, temp->edad,temp->promedio);
		temp = temp->sig;
	}
}


void cortaycarga(char *cadena, struct Alumno *alumno){
	char separador[] =",";
	char *item;
	int i=0;

	item = strtok(cadena, separador);
	i++;
	strcpy(alumno->nombre, item);
	while(item != NULL){
		
		item = strtok(NULL, separador);
		if(i==1){
			alumno->edad = atoi(item);
		}
		if(i==2){
			alumno->promedio = atof(item);
		}
		if(i==3){
			alumno->sexo = item[0];
		}
		i++;

	} 
}
