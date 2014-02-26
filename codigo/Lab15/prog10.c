#include <stdio.h>

int main(){
	
	int x[]={1,20,-1,50,2};
	int *p;

	p = x;
	p++;
	p--;
	printf("%d\n", *p);

}
