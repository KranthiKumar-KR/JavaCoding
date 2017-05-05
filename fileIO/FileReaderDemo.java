package fileIO;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\krant\\Desktop\\SystemVolumeInformation.txt");
		FileReader fr1 = new FileReader(f);
		File f1 = new File("C:\\Users\\krant\\Desktop\\SystemVolumeInformation2.txt");
		FileWriter fw = new FileWriter(f1);
		int i = fr1.read();
		while (i != -1) {
			System.out.println((char) (i));
			fw.write(i+1);
			i = fr1.read();
		}
		fr1.close();
		fw.flush();
		fw.close();
	}

}
// FileReader fr = new FileReader(f);
/*
 * char[] ch = new char[(int) f.length()]; fr.read(ch); for(char ch1 : ch){
 * System.out.println(ch1); }
 */
