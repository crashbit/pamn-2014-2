
#include <stdio.h>

int main(){
	int x[5]={4, 5,78, 101, 22};
	int y;
	int *ap;
	char letra;

	x[4]=5;
	y=20;

	printf("\n %p \n", x);
	printf("\n %p \n", &x[1]);
	printf("\n %p \n", &y);
	printf("\n %p \n", &letra);
	printf("\n %ld \n", sizeof(x));


}