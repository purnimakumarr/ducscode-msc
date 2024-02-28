#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main() {
	int parent_pid;
	parent_pid = getppid();
	printf("Parent process ID is %d", parent_pid);
}