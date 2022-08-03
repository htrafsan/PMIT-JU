/*
HASAN TAHSIN RAFSAN
CSE 406
SPRING 2021
4 NOVEMBER 2021
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include<mutex>

int main(int argc, char *argv[]) {
 int rc = fork();
 int rc2 = fork();
 std::mutex process;
if (rc == 0) {//new process (children)
    process.lock();
    printf("hello, my id is: (pid:%d)\n", (int) getpid());
    printf("hello, my id is: (pid:%d)\n", (int) getpid());
    process.unlock();
 }

else {  // parent(the main process)
    process.lock();
    printf("hello, my id is: (pid:%d)\n",(int) getpid());
    printf("hello, my id is: (pid:%d)\n",(int) getpid());
    process.unlock();
 }


 if (rc2 == 0) { //new process (children)
     process.lock();
     printf("hello, my id is: (pid:%d)\n", (int) getpid());
     printf("hello, my id is: (pid:%d)\n", (int) getpid());
     process.unlock();
 }

else {  // parent(the main process)
    process.lock();
    printf("hello, my id is: (pid:%d)\n",(int) getpid());
    printf("hello, my id is: (pid:%d)\n",(int) getpid());
    process.unlock();
 }
 return 0;
}
