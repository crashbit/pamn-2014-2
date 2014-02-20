#include <stdio.h>

int main(){

	FILE *fp;
	char nombre[20];
	int edad;
	float promedio;
	char sexo;

	fp=fopen("alumnos.txt", "r");

	if(fp==NULL){
		printf("No existe el archivo LOL!!");
		return 0;
	}

	while(!feof(fp)){
		fscanf(fp, "%s,%d,%f,%c", nombre, &edad, &promedio, &sexo);
		printf("%s - %d - %f - %c\n", nombre, edad, promedio, sexo);
	}

	fclose(fp);


	return 0;
}