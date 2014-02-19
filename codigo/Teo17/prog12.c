#include <stdio.h>
#include <string.h>

#include <stdlib.h>

int main(){

	char nombres[] = "pedro,33,8.2,m";
	char separador[] = ", .";
	char *elemento;
	int i=0;

	elemento = strtok(nombres, separador); 
	i++;
	while(elemento != NULL){
		printf("%s \n", elemento);
		elemento = strtok(NULL, separador);
		if(i==1){
			printf("%d \n ", atoi(elemento)*100);
		}
		if(i==2){
			printf("%f \n ", atof(elemento)*100);
		}
		i++;

	}

	return 0;
}
