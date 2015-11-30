package properties;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileOperation {
	File file = null;
	String[] list;

	public FileOperation(String address, String fileName) {
		file = new File(address + fileName);
	}

	public String[] readFile() {
		BufferedReader reader = null;
		try {
			System.out.println("��ȡ�ļ�����...");
			list = new String[getTotalLines()+1];
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
			while ((tempString = reader.readLine()) != null && line<getTotalLines()) {
				// ��ʾ�к�
				list[line] = tempString;
				//System.out.println(tempString);
				line++;
			}
			list[line] = tempString;
			System.out.println(tempString);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return list;
		/*for(String temp: list){
			System.out.println(temp);
			System.out.println();
		}*/
	}
	
	public String getName(int line){
		return list[line];
	}

	public int getTotalLines() throws IOException {
		FileReader in = new FileReader(file);
		LineNumberReader reader = new LineNumberReader(in);
		String s = reader.readLine();
		int lines = 0;
		while (s != null) {
			lines++;
			s = reader.readLine();
		}
		reader.close();
		in.close();
		return lines;
	}
	
	public void write(String text){
		  try (FileOutputStream fop = new FileOutputStream(file)) {
			  
			   // if file doesn't exists, then create it
			   if (!file.exists()) {
			    file.createNewFile();
			   }
			 
			   // get the content in bytes
			   byte[] contentInBytes = text.getBytes();
			 
			   fop.write(contentInBytes);
			   fop.flush();
			   fop.close();
			 
			   System.out.println("Done");
			 
			  } catch (IOException e) {
			   e.printStackTrace();
			  }
	}

}
