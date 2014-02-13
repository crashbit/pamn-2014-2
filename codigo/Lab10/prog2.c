#include <stdio.h>

int main(){

	int x[5]={40, 3, 2, 1, 20};
	int i;

	for (i=4;i>=0;i--){
		printf("%d\n", x[i]);
	}

	x[6] = 30;

	return 0;
}