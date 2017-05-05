package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PassDecoder {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\krant\\Desktop\\SystemVolumeInformation2.txt"); //encoded input file path
		FileReader fr1 = new FileReader(f); 
		File f1 = new File("C:\\Users\\krant\\Desktop\\SystemVolumeInformation3.txt"); // decoded output file path
		FileWriter fw = new FileWriter(f1);
		int i = fr1.read();
		while (i != -1) {
			System.out.println((char) (i));
			fw.write(i+1); //decoding
			i = fr1.read();
		}
		fr1.close();
		fw.flush();
		fw.close();
	}
}
