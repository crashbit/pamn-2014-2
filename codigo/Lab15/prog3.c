#include <stdio.h>

int main(){
	int x[3][3]={{1,2,3}, {1,2,3}, {1,2,3}};
	int i, j;

	printf("Tamanno es %ld\n", sizeof(x));

	for(i=0 ;i < 3; i++){
		for(j=0;j<3;j++){
			printf("%p ", &x[i][j]);
		}
		printf("\n");
	}
	printf("\n");

	return 0;
}