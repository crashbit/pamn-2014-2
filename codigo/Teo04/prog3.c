#include <stdio.h>
#include <stdlib.h>

int main(){
	
	struct Alumno{
		int edad;
		char nombre[20];
		char numCuenta[10];
		struct Alumno *sig;
	};

	int i;
	struct Alumno *ing;  
	struct Alumno *lista, *temp;

	lista = (struct Alumno *)malloc(sizeof(struct Alumno));
	temp = (struct Alumno *)malloc(sizeof(struct Alumno));
	lista->sig = NULL;

	for(i=0;i<3;i++){
		ing = (struct Alumno *)malloc(sizeof(struct Alumno));
		ing->sig = lista->sig;
		lista->sig = ing;
		scanf("%d", &ing->edad);
	}

	temp = lista->sig;
	while(temp != NULL){
		printf("\n %d  \n", temp->edad);
		temp = temp->sig;
	}


	return 0;
}