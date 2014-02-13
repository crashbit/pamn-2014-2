#include <stdio.h>
#include <stdlib.h>

int main(){

	//int x[3][3]={{1, 23, 45}, {4, 3, 2}, {56, 28, 3}};
	int x[3][3];
	int i, j;
	int numero;

	for(i=0;i<3;i++){
			printf("renglon\n");
		for(j=0;j<3;j++){
			
			printf("Pos %d, %d, ", i+1, j+1);
			scanf("%d", &x[i][j]);
		}
		printf("\n");
	}

	for(i=0;i<3;i++){
			
		for(j=0;j<3;j++){
			printf("%d ", x[i][j]);
		}
		printf("\n");
	}

	return 0;
}