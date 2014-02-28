#include <stdio.h>
#include <math.h>

double f(double valor);
double f_prima(double x);
int main(){

	double xni, xn=1.2;
	double tolerancia=0.002;
	FILE *fp;
	int i =0;

	fp = fopen("resultado.txt", "w");
	if(fp == NULL){
		printf("no existe el archivo\n");
		return 1;
	}

	do{
		
		xni = xn - (f(xn)/f_prima(xn));


		

		fprintf(fp, "%d\t%f\t%f\t%f\n", i, xn, xni, fabs(xni-xn));
		printf("%d\t%f\t%f\t%f\n", i, xn, xni, fabs(xni-xn));

		if(fabs(xni-xn)<tolerancia) break;
		xn = xni;
		i++;
	
	}while(f(xni)!=0);

	printf("el resultado es: %f", xni);

	return 0;
}

double f(double x){
	return ((x * exp(x)) - 5);
}

double f_prima(double x){
	return ((x * exp(x)) + exp(x));
}










