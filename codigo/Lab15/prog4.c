#include <stdio.h>

int main(){

	struct Alumno{
		char numCuenta[9];
		char nombre[20];
		int edad;
	};

	struct Alumno puma[13200];

	puma[1].edad = 18;
	printf("La edad es: %d\n", puma[1].edad);

	return 0;
}