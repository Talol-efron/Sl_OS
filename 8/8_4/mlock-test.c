#include <stdio.h>
#include <sys/types.h>
#include <sys/mman.h>
#include <stdlib.h>


#define K 1024
#define SIZE 1024*100

int
main(int ac,char *av[]) 
{
    int i,j,count;
    char *pool = (char *)malloc(SIZE*K);
    if (ac < 2) {
        fprintf(stderr,"%s 0 or %s 1\n",av[0],av[0]);
        exit(0);
    }
    int flag = atoi(av[1]);
    count = 0;
    j = 0;
    if (flag) {
    if (mlock((char *)((long)main ), 4096)) {
      perror("main mlock");
	exit(1);
    }
    if (mlock((char *)((long)pool ), SIZE*K)) {
      perror("pool mlock");
	exit(1);
    }
    }

    for(;;) {	
	for(i = 0; i < SIZE*K; i++) {
	    pool[i] = j++;
	}
	fprintf(stderr,"loop %5d\n",count++);
    }
    return 0;
}
