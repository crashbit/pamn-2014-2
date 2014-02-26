#include <stdio.h>
#include <stdlib.h>

int main(){
	
	int *p;

	p = (int *)malloc(5*sizeof(p));
	
	p[2] = 30;

	printf("%d\n", p[2]);

}
