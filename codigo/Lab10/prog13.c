#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;
	float *f;
	char *c;
	int x=100;
	float y;

	void *temp;

	p = &x;
	f = &y;

	printf("%p\n", p);
	temp = p;
	p = (int *)temp;
	printf("%p -> %d\n", p, *p);

}