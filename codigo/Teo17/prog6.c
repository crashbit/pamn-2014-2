#include <stdio.h>

void intercambia(int *a, int *b);

int main(){
	int x = 33;
	int y = 55;

	printf("%d - %d", x, y);
	intercambia(&x, &y);
	printf("\n%d - %d\n", x, y);

	return 0;
}

void intercambia(int *a, int *b){
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}