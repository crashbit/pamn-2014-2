#include <stdio.h>

int main(){
	FILE *fp;
	char c;

	fp = fopen("hola.txt","r");

	if(fp == NULL){
		printf("No existe el archivo\n");
		return 0;
	}

	while(!feof(fp)){
		c = fgets(fp);
		printf("%c", c);
	}
	
	fclose(fp);
}