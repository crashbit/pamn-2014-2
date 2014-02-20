#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;

	p = (int *)malloc(4 * sizeof(int));

	p[0] = 10;
	p[1] = 20;
	p[2] = 3;
	printf("%d\n", p[1]);
}