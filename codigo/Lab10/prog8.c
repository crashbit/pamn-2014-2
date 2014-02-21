#include <stdio.h>

int main(){
	int *p;
	int x;
	
	x = 3;
	p = &x;
	*p = 22;
	printf("%d\n", *p);


	return 0;
}