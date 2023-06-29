package day2.part1_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileCopySample {
	
	public static void copy(File source, File destination) throws FileNotFoundException, IOException
	{
		int b;
		
		try(    InputStream in = new BufferedInputStream(new FileInputStream(source));
				OutputStream ou = new BufferedOutputStream(new FileOutputStream(destination)) )
		{
			byte buffer[] = new byte[32];
			int lengthRead=0;
			
			/*while((b=in.read())!=-1)
			{
				ou.write(b);
			}*/
			while((lengthRead=in.read(buffer))>0)
			{
				System.out.println(lengthRead);
				ou.write(buffer, 0, lengthRead);
				ou.flush();
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File source = new File("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenu.txt");
		File destination = new File("C:\\Users\\amine\\Desktop\\Formation_OCP\\contenuCopy.txt");
		copy(source,destination);
	}

}
