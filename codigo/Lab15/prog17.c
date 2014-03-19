#include <stdio.h>
int main(){

	float matriz[3][3]={{3,-0.1,-0.2},{0.1,7,-0.3},{0.3,-0.2,10}};
	float b[3] = {7.85, -19.3, 71.4};
	int i=0,j=0,k=0,n=3;
	float factor;

for(k=0;k<n;k++){
	for(i=k+1;i<n;i++){
		factor = matriz[i][k]/matriz[k][k];
		matriz[i][k] = 0;
		for(j=k+1;j<n;j++){
			matriz[i][j] = matriz[i][j] - (factor * matriz[k][j]); 
		}
		b[i] = b[i]-factor*b[k];
	}
}

for(i=0;i<n;i++){
	for(j=0;j<n;j++){
		printf("\t%f ", matriz[i][j]);
	}
	printf("\t|%f", b[i]);
	printf("\n");
}

















}
