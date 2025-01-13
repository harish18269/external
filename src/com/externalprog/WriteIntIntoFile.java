package com.externalprog;

import java.io.*;

public class WriteIntIntoFile {
	    public static void main(String[] args) {
	        try {
	        	FileInputStream f1 = new FileInputStream("D:\\sequence1.txt");
	        	FileInputStream f2 = new FileInputStream("D:\\sequence2.txt");
	        	
	        	FileOutputStream fout = new FileOutputStream("D:\\fileoutputstream");
	        	
	        	SequenceInputStream s = new SequenceInputStream(f1, f2);
	        	
	        	int i=0;
	        	while((i=s.read()) !=-1) {
	        		System.out.println((char)i);
	        		fout.write(i);
	        	}
	        	
	        	fout.close();
	        	s.close();
	        	f1.close();
	        	f2.close();
	        	
	        }catch(Exception e) {
	        	System.out.println(e);
	        }
	        
	        System.out.println("Done");
	    }
}
