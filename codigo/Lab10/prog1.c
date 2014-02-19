#include <stdio.h>

int main(){
	int x=3;
	int y=20;


	printf("La direccion de x es: %p\n\n", &x);
	printf("La direccion de y es: %p\n\n", &y);
	printf("El tamanno de un int es:%ld bytes\n\n", sizeof(int));

	return 0;
}