#include <stdio.h>
#include <math.h>

float f(float x);
float f_prima(float x);

int main(){

	double a= 1.2,b=1.4,c;
	double tolerancia = 0.002;
	int i=0;
	double xnuevo, xn=1.2;
	FILE *fp;

	//fp = fopen("biseccion.txt", "w");
	//fprintf(fp,"i\ta\tb\tc\tabs(a-b)\n\tF(a)\tF(b)\tF(c)\n");
	printf("Xnuevo\tXn\n");
	do{

		xnuevo = xn -(f(xn)/f_prima(xn));
		printf("%f\t%f\t%f\n", xnuevo, xn, fabs(xnuevo-xn));	
		if(fabs(xnuevo-xn)<tolerancia) break;
		if(i==10)break;
		xn = xnuevo;
		i++;
	}while( f(xnuevo)!=0);

	
	//fclose(fp);
}

float f(float x){
	return ((x*exp(x)) - 5);
}

float f_prima(float x){

	return ((x*exp(x))+exp(x));

}















