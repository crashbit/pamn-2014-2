#include <stdio.h>
#include <math.h>

float f(float x);

int main(){

	double a= 1.2,b=1.4,c;
	double tolerancia = 0.002;
	int i;
	FILE *fp;

	fp = fopen("biseccion.txt", "w");
	fprintf(fp,"i\ta\tb\tc\tabs(a-b)\n\tF(a)\tF(b)\tF(c)\n");

	do{

		c = (a+b)/2;
		
		if(f(a)*f(c)< 0 )
			b = c;
		else
			a = c;
		fprintf(fp,"%d\t%f\t%f\t%f\t%f\n",i, a, b, c,fabs(a-b) );
		fprintf(fp,"\t%f\t%f\t%f\n", f(a), f(b),f(c));
		fprintf(fp,"---------------------------------\n");
		
		i++;

	}while(fabs(a-b)>tolerancia || f(c)!=0);

	fprintf(fp,"Resultado es: %f\n", c);
	fclose(fp);
}

float f(float x){
	return ((x*exp(x)) - 5);
}

















