#include <stdio.h>

int main(){
	
	FILE *fp;

	fp=fopen("laboratorio.txt", "w");

	fprintf(fp, "Esta es una cadena  y esta es otra cadena\n");

	fclose(fp);

	return 0;	
}