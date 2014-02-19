#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>

int main(){
	FILE *fp;
	char c;
	char num[2]={'0', '0'};
	int total = 0;

	fp = fopen("hola.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo\n");
		return 0;
	}

	while(!feof(fp)){
		c = fgetc(fp);
		if(isdigit(c)){
			num[1] = c;
			total = total + atoi(num);
		}
	}
	printf("Gran total %d\n\n", total);
	fclose(fp);
	return 0;
}