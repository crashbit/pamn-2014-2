#include <stdio.h>
#include <string.h>

int main(){

	char nombres[]="Pedro juan.lola,zuzu,luis,Carlos";
	char separador[]=", ";
	char *item;

		item = strtok(nombres,separador);

		while(item != NULL){
			printf("%s\n", item);
			item = strtok(NULL,separador);

		}

	return 0;
}