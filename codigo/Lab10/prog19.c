#include <stdio.h>

int main(){

	FILE *fp;
	char cadena[20];
	char buffer;

	fp = fopen("binario.txt", "ab+");

	if(fp==NULL){
		printf("El archivo no existe\n");
		return 1;
	}

	printf("teclea una cadena");
	scanf("%s", cadena);
	fwrite(cadena, sizeof(char), 20, fp);

	while(fread(&buffer, sizeof(char), 1, fp)==1){
		printf("usted tecleo: %c", buffer);

	}
	
	fclose(fp);

}















