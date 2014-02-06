#include <stdio.h>

int main(){
	int x;
	int y;
	int *ap;

	x=5;
	y=20;

	ap = &x;

	printf("\n %p -> %p -> %d \n", &x, ap, *ap);

	*ap = 69;
	printf("\n %p -> %p -> %d \n", &x, ap, x);


}