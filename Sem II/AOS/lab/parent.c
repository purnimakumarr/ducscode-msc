#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
  int pid = fork();
  if (pid < 0) {
    perror("Fork failed");
    return 1;
  } else if (pid == 0) {
    printf("Child process created.\n");
    execl("./child_executable", "./child_executable", "-l", NULL);
    perror("execl failed");
    return 1;
  } else {
    printf("Parent process waiting for child to finish...\n");
    wait(NULL);
    printf("Child process finished.\n");
  }
  return 0;
}
