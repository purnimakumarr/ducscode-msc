#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main() {
	printf("This is to demonstrate the fork()\n");
	fork();
	fork();
	fork();
	printf("Hello World\n");
}