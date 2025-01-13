package com.externalprog;

public class ThreadEx extends Thread { 
	 public void run(){    
	  for(int i=1;i<9;i++){      
	    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}    
	    System.out.println(i);    
	  }    
	 }    
	 public static void main(String args[]){    
	  ThreadEx t1=new ThreadEx();    
	  ThreadEx t2=new ThreadEx();    
	     
	  t1.start();    
	  t2.start();    
	 }        
}
