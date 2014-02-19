#include <stdio.h>

int main(){
	int numeros[10]={4,5,3,2,7,8,4,0,8,-1};
	int i, j;
	int temp;

	for(i=0;i<10;i++){
		for(j = i+1;j<10;j++){
			if(numeros[i] < numeros[j]){
				temp = numeros[i];
				numeros[i] = numeros[j];
				numeros[j] = temp;
			}
		}
	}
	for(i=0;i<10;i++){
		printf("%d ", numeros[i]);
	}


	return 0;
}