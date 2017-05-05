package fileIO;

import java.io.*;

public class BufferedReaderDemo {
	static String has;

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\krant\\Desktop\\SystemVolumeInformation.txt");
		BufferedReader br = new BufferedReader(fr);
		String data = br.readLine();
		while (data != null) {
			if (data.contains("kranthi")) {
				System.out.println(data);
			}
			data = br.readLine();
		}
		br.close();
	}

}
