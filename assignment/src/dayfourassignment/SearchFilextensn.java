package dayfourassignment;

import java.io.File;
import java.util.Scanner;

public class SearchFilextensn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String path=sc.next();
		String ext=sc.next();
		SearchFilextensn obj = new SearchFilextensn();
		obj.listFiles(path, ext);
		
	}
	public void listFiles(String pat,String extt) {
		SearchFile file=new SearchFile(extt);
		File folder = new File(pat);

		if(folder.isDirectory()==false){
			System.out.println("Folder does not exists: " + pat);
			return;
		}

		String[] list = folder.list(file);

		if (list.length == 0) {
			System.out.println("There are no files with " + extt + " Extension");
			return;
		}

		for (String file1 : list) {
			String temp = new StringBuffer(pat).append(File.separator)
					.append(file1).toString();
			System.out.println("file : " + temp);
		}
	}

}
