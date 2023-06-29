package day2.part1_io;

import java.io.Closeable;
import java.io.IOException;

public class MaRessource implements AutoCloseable{
	
	public void processing()
	{
		System.out.println("processing...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Fin du traitement");
		
	}

}
