#include <stdio.h>
#include <string.h>

int main(){
	
	struct Alumno{
		char numCuenta[10];
		char nombre[20];
		int edad;
	};

	struct Alumno ing[13200];

	strcpy(ing[1].numCuenta, "88309213");

	printf("%s\n", ing[1].numCuenta);

	return 0;
}