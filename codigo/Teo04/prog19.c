#include <stdio.h>


int main(){

	int matriz[][]={{1,2,3,9},{4,5,6,24},{3,1,2,4}};
	int i=0;j=0;k=0;n=3;

for(k=0;k<n;k++){
	for(i=k+1;i<n;i++){
		factor = matriz[i][k]/matriz[k][k];
		matriz[i][k] = 0;
		for(j=k+1;j<n;j++)
			matriz[i][j] = matriz[i][j] - (factor * matriz[k][j]); 
	}
}

for(i=0;i<n;i++){
	for(j=0;j<n++){
		printf("%d ", matriz[i][j]);
	}
	printf("\n");
}

}