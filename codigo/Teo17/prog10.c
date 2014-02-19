#include <stdio.h>

int main(){

	FILE *fp;
	int x[4];
	char nombre[20];
	int edad;
	float promedio;
	char sexo;
	int total;

	fp = fopen("alumnos.txt", "r");

	if(fp == NULL){
		printf("No se encuentra el archivo");
		return 0;
	}

	total = 0;
	while(!feof(fp)){
		fscanf(fp,"%s,%d,%f,%c", nombre,&edad,&promedio,&sexo);
		printf("%s tiene %d annos, su promedio %f y es:%c\n\n", nombre,edad,promedio,sexo);
	}

	return 0;

}