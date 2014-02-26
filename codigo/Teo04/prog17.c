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

void corta(char *cadena, struct Alumno *var);

int main(){

	FILE *fp;
	char cadena[100];
	struct Alumno *inges, *lista, *temp;

	fp=fopen("alumnos.txt", "r");

	lista = creaNodo();

	if(fp==NULL){
		printf("No existe el archivo LOL!!");
		return 0;
	}


	while(!feof(fp)){
		inges = creaNodo();
		fscanf(fp, "%s\n", cadena);
		corta(cadena, inges);
		insertaNodo(lista, inges);
		printf("%s\n",inges->nombre); 
	}

	temp = lista->sig;
	muestraLista(temp);

	fclose(fp);


	return 0;
}

void corta(char *cadena, struct Alumno *var){
	char *item;
	char separador[]=",";
	int i=0;

	item = strtok(cadena,separador);
	strcpy(var->nombre,item);
	i++;
		while(item != NULL){
			item = strtok(NULL,separador);
			if(i==1){
				var->edad = atoi(item);
			}
			if(i==2){
				var->promedio = atof(item);
			}
			if(i==3){
				var->sexo = item[0];
			}
			i++;
		}
		printf("------\n");
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
