#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main() {
	// fork();
	// printf("The PID id %d\n", getpid());
	
	int pid;
	pid = fork();
	
	if(pid > 0) {
		printf("Parent Process PID is %d", pid);
	}
}