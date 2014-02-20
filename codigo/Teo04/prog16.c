#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void corta(char *cadena);

int main(){

	FILE *fp;
	char cadena[100];

	fp=fopen("alumnos.txt", "r");

	if(fp==NULL){
		printf("No existe el archivo LOL!!");
		return 0;
	}

	while(!feof(fp)){
		fscanf(fp, "%s", cadena);
		corta(cadena);
	}

	fclose(fp);


	return 0;
}

void corta(char *cadena){
	char *item;
	char separador[]=",";
	int i=0;

	item = strtok(cadena,separador);
	i++;
		while(item != NULL){
			printf("%s\n", item);
			item = strtok(NULL,separador);
			if(i==1)printf("%d\n", atoi(item)*10);
			i++;
		}
		printf("------\n");
}