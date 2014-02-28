#include <stdio.h>

int main(){

	FILE *fp;
	char c;

	fp = fopen("laboratorio2.txt", "r"); //otros permisos: w a
 
	if(fp == NULL){
		printf("No existe el archivo\n");
		return 1;
	}

	while(!feof(fp)){
		c = getc(fp);
		printf("%c", c);
	}

}