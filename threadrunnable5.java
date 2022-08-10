import java.util.*;
import java.lang.*;
import java.io.*;

class threadrunnable5 implements Runnable{
    public void run(){
        System.out.println("Hello India: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
        	Thread thread=new Thread(new threadrunnable5());
            thread.start();
        }
    }
}
