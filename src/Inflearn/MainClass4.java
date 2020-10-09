package Inflearn;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass4 {

	public static void main(String[] args) {

		String str = "Hello Java World!!";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream("C:\\03Workspace\\hello.txt");
			dataOutputStream = new DataOutputStream(outputStream);
			
			dataOutputStream.writeUTF(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
