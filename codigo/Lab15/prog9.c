#include <stdio.h>

int main(){
	int *p;
	float *f;

	int x=30;
	float y= 3.14;

	void *generico;

	p = &x;
	f = &y;

	generico = f;

	f = (float *)generico;

	printf("%f\n\n", *f);	

}
