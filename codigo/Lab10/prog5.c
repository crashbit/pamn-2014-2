#include <stdio.h>

int main(){
	
	struct Credencial{
		char nombre[20];
		char apepat[20];
		int edad;
	};

	struct Credencial ife;

	printf("%ld bytes\n", sizeof(struct Credencial));

	printf("Introduzca su nombre: ");
	scanf("%s", ife.nombre);

	printf("Su nombre es: %s\n", ife.nombre);

	return 0;
}