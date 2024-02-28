#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>

int main() {
	int pid;
	pid = getpid();
	printf("Process ID is %d", pid);
	for(int i = 0; i <=5; i++) {
		printf("\ni: %d", i);
	}
}