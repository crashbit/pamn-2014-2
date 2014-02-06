
#include <stdio.h>

main(){
	int x[3][3];
	int m[5]={33,54,102, 21, 88};
	int y, z;
	char c;
	int i, j;
	int *ap;

	printf("\n%p\n", &y);
	printf("\n%p\n", &z);
	printf("\n%p\n", &c);
	printf("\n-------------------------\n");
	printf("\n%p\n", x);
	for(i=0;i<5;i++){
		for(j=0;j<5;j++){
			printf("\n%p\n", &x[i][j]);
		}
	}
	printf("\n-------------------------\n");
	ap = m;
	printf("\n%p->%p = %d\n", &m, ap, *ap);
	ap++;
	printf("\n%p->%p = %d\n", m, ap, *ap);
	ap++;ap++;ap++;ap++;ap++;
	printf("\n%p->%p = %d\n", m, ap, *ap);



}