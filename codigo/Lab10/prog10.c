#include <stdio.h>
#include <stdlib.h>

int main(){

	int *p;
	int x=10;
	int y=20;

	p = &x;
	p--;
	printf("%d\n", *p);
}