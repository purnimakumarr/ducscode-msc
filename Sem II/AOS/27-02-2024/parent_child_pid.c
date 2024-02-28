#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main() {
	int pid = fork();

  // print parent PID
  /* if(pid > 0) {
    printf("Parent process PID is %d\n", pid);
  } */

  // child's PID will be 0 by default
  /* if(pid == 0) {
    printf("Child process\n");
  } */

  // return both parent and child PID
  printf("PID: %d\n", pid);
}