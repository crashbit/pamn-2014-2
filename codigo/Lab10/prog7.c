#include <stdio.h>

int main(){
	
	struct Credencial{
		char nombre[20];
		char apepat[20];
		int edad;
	};

	struct Credencial ife[10];

	printf("%ld bytes\n", sizeof(struct Credencial));

	printf("Introduzca su nombre: ");
	scanf("%s", ife[2].nombre);

	printf("Su nombre es: %s\n", ife[2].nombre);

	return 0;
}