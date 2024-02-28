#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>

int main() {
  if(fork() > 0) {
    printf("Parent\n");
    sleep(50);
  }
}