#include <stdio.h>
#include <stdlib.h>

int main(){

	struct Credencial{
		int id;
		char nombre[20];
		int edad;
		char sexo;
		struct Credencial *sig;
	};
	int i;

	struct Credencial *ife, *lista, *temp;

	lista = (struct Credencial *)malloc(sizeof(struct Credencial));
	lista->sig = NULL;

	for(i = 0; i< 4; i++){
		ife = (struct Credencial *)malloc(sizeof(struct Credencial));
		scanf("%d", &ife->edad);

		ife->sig = lista->sig;
		lista->sig = ife;
	}

	temp = lista->sig;

	while(temp != NULL){
		printf("%d - ", temp->edad);
		temp = temp->sig;
	}
}