#include <stdio.h>

float f(float valor);
main(){

	float a, b, c;
	float tolerancia;

	do{

		c = (a+b)/2;
		if(f(c)*f(a)<0)
			b = c;
		else
			a = c;

	}while(fabs(a-b)<tolerancia || f(c) ==0);
}

float f(float x){

		return (x * exp(x) - 5);
}