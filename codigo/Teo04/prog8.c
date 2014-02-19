#include <stdio.h>

int main(){
	FILE *fp;
	char cadena[5];
	int i=0;

	fp = fopen("hola.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo\n");
		return 0;
	}

	while(!feof(fp)){
		//fgets(cadena, 5, fp);
		i++;
		if(i==2) break;
	}
	return 0;
}