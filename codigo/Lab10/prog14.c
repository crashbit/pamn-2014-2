#include <stdio.h>
#include <stdlib.h>

//No es correcto
int main(){

	int vector[]={1,2,4,5,6,7};

	int *p;
	int *p1;

	*p = vector;
	*p1 = vector +1;

	printf("%d", *p1);
}