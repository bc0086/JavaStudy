package Inflearn;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass6 {

	public static void main(String[] args) {
		
		String fileName = "C:\\03Workspace\\hello.txt";
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String strLine;
			
			while ((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (br != null) br.close();
				if (fr != null) br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
