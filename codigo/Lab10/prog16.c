#include <stdio.h>

int main(){

	FILE *fp;

	fp = fopen("laboratorio.txt", "r"); //otros permisos: w a

	if(fp == NULL){
		printf("No existe el archivo\n");
		return 1;
	}



}