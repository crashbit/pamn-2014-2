#include <stdio.h>
int x;
void intercambia(int *a, int *b);
int main(){
	int x = 33;
	int y = 66;

	printf("%d - %d \n", x, y);
	intercambia(&x, &y);
	printf("%d - %d \n", x, y);
}

void intercambia(int *a, int *b){
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
	
}