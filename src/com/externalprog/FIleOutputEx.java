package com.externalprog;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FIleOutputEx {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\fileoutputstream",true);
			OutputStreamWriter out = new OutputStreamWriter(fout);
			BufferedWriter bout = new BufferedWriter(out);
			bout.write("Hello java this is me");
			bout.newLine();
			bout.write(65);
			bout.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("File writing is completed successfully.");
	}

}
