# Multi-Threading in Java 
A thread is the unit of a process. i.e threads are task perform on a computer system. We have single and multi-threading

###### Threads can be use by extending a class `Thread Class` or  by implementing a `Runnable` interface  

+ By extends Thread class - the code snippet below is how a class Count extend to a Thread class

```
class Count extends Thread {
public void run(){
}
}

```
**Note -> When you create a thread, you have to start() the thread and every time a class extends a Thread the class becomes a thread**

`The start() call on the run() inside the thread`

+ By implementing the Runnable interface

```
class Count implements Runnable{
public void run(){
}
}

```


*Check the source code for more info*
