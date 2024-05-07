#include <stdio.h>
#include <unistd.h>
#include<sys/types.h>

int main() {
	int parent_pid = getpid();
  printf("Inside the child process...\n");
	printf("Parent process ID is %d\n", parent_pid);
}