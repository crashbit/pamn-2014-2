#include <stdio.h>
#include <stdlib.h>

void funcion(int *a, int *b);
int main(){

	int x = 20;
	int y = 30;

	printf("%d - %d \n", x, y);
	funcion(&x, &y);
	printf("%d - %d \n", x, y);

	return 0;
}

void funcion(int *a, int *b){
int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}