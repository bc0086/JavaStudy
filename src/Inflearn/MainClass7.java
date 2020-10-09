package Inflearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass7 {

	public static void main(String[] args) {
		
		String fileName = "C:\\03Workspace\\hello.txt";
		
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			String str = "Hello Java World ~~ \n";
			str += "Hello C World~~ \n";
			str += "Hello C++ World~~ \n";
			
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);
			
			System.out.println("end");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (bw != null) bw.close();
				if (fw != null) fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}
