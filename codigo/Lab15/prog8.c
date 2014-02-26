#include <stdio.h>

int main(){
	
	int *p;
	int x = 20;

	p = &x;

	*p = 30;
	printf("%d %d\n\n", x, *p);
}
