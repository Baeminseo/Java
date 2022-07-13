package ioexam;

import java.io.File;
import java.io.IOException;

public class FileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("C:\\Players");
		if (!dir.exists()|| !dir.isDirectory()) {
			dir.mkdir();
		}else {
			File theFile = new File(dir,"qoalstj01.dat");
			//상위 폴더 하위에 theFile 을 생성해라
			try {
				if(theFile.createNewFile()) {
					System.out.println(theFile.getName()+" 이 잘 생성됨.");
				}
				else {
					System.out.println(theFile.getAbsolutePath());
					System.out.println(theFile.getParent());
					System.out.println(theFile.lastModified());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
