#include <stdio.h>
#include <math.h>

double f(double valor);
int main(){

	double a=1.2, b=1.4, c;
	double tolerancia=0.0002;
	FILE *fp;
	int i =0;

	fp = fopen("resultado.txt", "w");
	if(fp == NULL){
		printf("no existe el archivo\n");
		return 1;
	}

	do{
		c = (a+b)/2;
		if(f(a)*f(c)<0)
			b = c;
		else 
			a = c;

		fprintf(fp, "%d\t%f\t%f\t%f\n", i, a, b, c);
		fprintf(fp, "\t%f\t%f\t%f\n", f(a), f(b), f(c));
		
		printf("%d\t%f\t%f\t%f\t%f\n", i, a, b, c, fabs(a-b));
		printf("\t%f\t%f\t%f\n", f(a), f(b), f(c));
		i++;
	}while(fabs(a-b)>tolerancia || f(c)==0);

	return 0;
}

double f(double x){
	return ((x * exp(x)) - 5);
}











