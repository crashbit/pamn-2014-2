#include <stdio.h>

int main(){
	
	int *p;
	int x = 20;

	p = &x;

	printf("%p %p\n\n", &x, p);
}

