#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(){
	
	struct Alumno{
		char numCuenta[10];
		char nombre[20];
		int edad;
		struct Alumno *sig;
	};

	int i;

	struct Alumno *ing;
	struct Alumno *lista;
	struct Alumno *temp;

	//alojamos la lista en memoria
	lista = (struct Alumno *)malloc(sizeof(struct Alumno));
	lista->sig = NULL;

	for(i=0;i<3;i++){
		ing = (struct Alumno *)malloc(sizeof(struct Alumno));
		ing->sig = NULL;

		ing->sig = lista->sig;
		lista->sig = ing;
		scanf("%s", ing->numCuenta);
	}

	temp = lista->sig;
	while(temp != NULL){
		printf("%s\n", temp->numCuenta);
		temp = temp->sig;
	}
	return 0;
}