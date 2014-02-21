#include <stdio.h>
#include <stdlib.h>

const int total;

//No es correcto
int main(){

	int vector[]={1,2,4,5,6,7};

	const int total = 500;
	const int *p;

	int *p;
	int *p1;

	*p = vector;
	*p1 = vector +1;

	printf("%d", *p1);
}