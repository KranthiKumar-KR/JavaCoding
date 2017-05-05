package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PassEncoder {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\krant\\Desktop\\SystemVolumeInformation1.txt"); //input file directory
		FileReader fr1 = new FileReader(f);
		File f1 = new File("C:\\Users\\krant\\Desktop\\SystemVolumeInformation2.txt"); //output file directory
		FileWriter fw = new FileWriter(f1);
		int i = fr1.read();
		while (i != -1) {
			System.out.println((char) (i));
			i = fr1.read();
			fw.write(i+1); //encoding
		}
		fr1.close();
		fw.flush();
		fw.close();
	}
}
