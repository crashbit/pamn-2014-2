#include <stdio.h>

int main(){
	
	FILE *fp;
	char cadena[]="Esta es una prueba de archivos binarios";

	fp=fopen("laboratorio.bin", "wb");

	fwrite(cadena, sizeof(char), 30, fp);
	fclose(fp);

	return 0;	
}