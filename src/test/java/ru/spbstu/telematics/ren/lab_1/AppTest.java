package ru.spbstu.telematics.ren.lab_1;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void maintest()
    {
        String[] args = null;
		App.main(args);
    }
    @Test
    public void readfiletest1() throws IOException
    {
    	File f1=new File("C:\\学习\\Java\\lab_1\\src\\main\\java\\ru\\spbstu\\telematics\\ren\\lab_1\\text.txt");
    	Rfile.readfile(f1);
    }
    @Test
    public void readfiletest2() throws IOException
    {
    	File f1=new File("C:\\学习\\Java\\lab_1\\src\\main\\java\\ru\\spbstu\\telematics\\ren\\lab_1\\text2.txt");
    	Rfile.readfile(f1);
    }
}
