#include <stdio.h>

int main(){
	
	int x = 5;
	int y =20;
	int *ap;

	ap = &x;
	printf("\n%p->%p = %d\n", &x, ap, *ap);
	*ap = y; 
	printf("\n%p->%p = %d\n", &x, ap, x);
	printf("\n%p->%p->%p = %d\n", &x, ap,&ap, x);
	
	return 1;
}