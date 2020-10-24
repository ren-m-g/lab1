package ru.spbstu.telematics.ren.lab_1;

import java.io.*;

public class Rfile {
	public static String readfile(File F) throws IOException 
	{
        long len=F.length();
        char[]c=new char[(int) len];
        FileReader fr=new FileReader(F);
        fr.read(c);
        fr.close();
        String s=new String(c);
		return s;
	}
}
