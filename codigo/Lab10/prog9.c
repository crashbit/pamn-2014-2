#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;

	p = (int *)malloc(sizeof(int));

	*p = 3;
	p++;
	*p = 4;
	p--;
	printf("%d\n", *p);



}