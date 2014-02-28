//Metodo de la falsa posición
#include <stdio.h>
#include <math.h>

float f(float x);
int main(){

	double a=1.2,b=1.4,c;
	double tolerancia=0.002;
	int i=0;


	do{

		c = b - (f(b)*(a-b))/(f(a)-f(b));
		if(f(c)*f(a)<0)
			b = c;
		else 
			a = c;

		printf("%d\t%f\t%f\t%f\t%f\n",i, a, b, c,fabs(a-b) );
		printf("\t%f\t%f\t%f\n", f(a), f(b),f(c));
		printf("---------------------------------\n");
		i++;
		if(i==6)break;

	}while(fabs(a-b)>tolerancia || f(c)==0);

	return 0;
}

float f(float x){
	return ((x*exp(x)) - 5);
}
