#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main(){
	srand(time(NULL));
	printf("%i\n\n", rand());
	return 0;
}