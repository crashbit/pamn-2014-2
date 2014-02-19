#include <stdio.h>

int main(){
	FILE *fp;
	char cadena[10];
	int i=0;

	fp = fopen("hola.txt","r");

	if(fp == NULL){
		printf("No existe el archivo\n");
		return 0;
	}

	while(!feof(fp)){
		i++;
		fgets(cadena, 10, fp);
		printf("%s", cadena);
		if(i==1)break;
	}
	printf("Se leyeron %d veces el stream", i);	
	fclose(fp);
}