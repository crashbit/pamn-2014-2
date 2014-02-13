#include <stdio.h>
#include <stdlib.h>

struct Alumno{
		int edad;
		char nombre[20];
		char numCuenta[10];
		struct Alumno *sig;
};

struct Alumno *creaNodo();
void insertaNodo(struct Alumno *lista, struct Alumno *nodoNuevo);
void muestraLista(struct Alumno *lista);
int main(){
	
	int i;
	struct Alumno *ing;  
	struct Alumno *lista, *temp;

	lista = creaNodo();

	for(i=0;i<3;i++){
		ing = creaNodo();
		insertaNodo(lista, ing);
		scanf("%d", &ing->edad);
	}

	muestraLista(lista->sig);
	return 0;
}

struct Alumno *creaNodo(){

	struct Alumno *temp;
	temp = (struct Alumno *)malloc(sizeof(struct Alumno));
	temp->sig = NULL;
	return temp;
}

void insertaNodo(struct Alumno *lista, struct Alumno *nodoNuevo){
	nodoNuevo->sig = lista->sig;
	lista->sig = nodoNuevo;
}

void muestraLista(struct Alumno *lista){
	struct Alumno *temp;
	temp = lista;
	while(temp!= NULL){
		printf("\n - %d -", temp->edad);
		temp = temp->sig;
	}
}
