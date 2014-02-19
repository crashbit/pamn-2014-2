#include <stdio.h>

int main(){
	int x = 20;
	int y = 30;

	printf("\nLa direccion de x es: %p\n", &x);
	printf("\nLa direccion de y es: %p\n", &y);
	printf("El tamanno si importa %ld\n", sizeof(float));

	return 0;
}

