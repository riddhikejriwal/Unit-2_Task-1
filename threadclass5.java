import java.util.*;
import java.lang.*;
import java.io.*;

class threadclass5 extends Thread{
    public void run(){
        System.out.println("Hello all: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
        	threadclass5 thread=new threadclass5();
            thread.start();
        }
    }
}
