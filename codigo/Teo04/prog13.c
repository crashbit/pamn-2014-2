#include <stdio.h>

int main(){

	FILE *fp;
	int x[3];

	fp=fopen("numeros.txt", "r");

	if(fp==NULL){
		printf("No existe el archivo LOL!!");
		return 0;
	}

	while(!feof(fp)){
		fscanf(fp, "%d,%d,%d", &x[0], &x[1], &x[2]);
		printf("Total: %d\n",(x[0]+x[1]+x[2]));
	}

	fclose(fp);


	return 0;
}