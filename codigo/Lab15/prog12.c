#include <stdio.h>

int main(){
	
	FILE *fp;
	char c;

	fp = fopen("porno.mp3", "r");

	if(fp == NULL){
		printf("No existe el archivo");
		return 0;
	}

	while(!feof(fp)){
		c = fgetc(fp);
		printf("%c", c);
	}

	
	return 0;
}