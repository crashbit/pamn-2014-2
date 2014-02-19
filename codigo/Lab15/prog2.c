#include <stdio.h>

int main(){
	int x[5]={4, 67, 88, 90, 1};
	int i;

	printf("Tamanno es %ld\n", sizeof(x));

	for(i = 0; i<5; i++){
		printf("%p\n", &x[i]);
	}

	return 0;
}