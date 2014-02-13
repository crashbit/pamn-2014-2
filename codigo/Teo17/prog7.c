#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct Alumno{
		char numCuenta[10];
		char nombre[20];
		int edad;
		struct Alumno *sig;
};

struct Alumno *creaNodo();
void insertaNodo(struct Alumno *lista, struct Alumno *nodo);
void muestraLista(struct Alumno *lista);

int main(){
	
	int i;

	struct Alumno *ing;
	struct Alumno *lista;
	struct Alumno *temp;

	//alojamos la lista en memoria
	lista = creaNodo();

	//Creamos nodos y los insertamos en la lista
	for(i=0;i<3;i++){
		ing = creaNodo();
		insertaNodo(lista, ing);
		scanf("%s", ing->numCuenta);
	}

	muestraLista(lista->sig);
	return 0;
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
		printf("%s\n", temp->numCuenta);
		temp = temp->sig;
	}
}
