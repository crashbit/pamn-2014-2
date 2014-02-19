#include <stdio.h>
#include <ctype.h>

int main(){
	FILE *fp;
	char c;
	int numeros=0, alpha=0, car=0;

	fp = fopen("hola.txt", "r");

	if(fp == NULL){
		printf("No existe el archivo\n");
		return 0;
	}

	while(!feof(fp)){
		c = fgetc(fp);
		if(isdigit(c)) numeros++;
		else if(isalpha(c)) alpha++;
		else car++;
	}
	printf("Hay %d numeros\n", numeros);
	printf("Hay %d letras\n", alpha);
	printf("Hay %d car. puntuacion\n", car);


	fclose(fp);
	return 0;
}