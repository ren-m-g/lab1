package ru.spbstu.telematics.ren.lab_1;

import java.io.*;
/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args )
	{

		try {
			File f =new File("C:\\学习\\Java\\lab_1\\src\\main\\java\\ru\\spbstu\\telematics\\ren\\lab_1\\text.txt");
			String s=Rfile.readfile(f);
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("fail to open the file f");
			e.printStackTrace();
		}
	}
}
