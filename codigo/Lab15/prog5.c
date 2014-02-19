#include <stdio.h>

int main(){

	struct Alumno{
		char numCuenta[9];
		char nombre[20];
		int edad;
	};

	struct Alumno *puma;

	puma->edad = 18;
	printf("La edad es: %d\n", puma->edad);
	printf("El tamanno es: %ld\n", sizeof(puma));

	return 0;
}