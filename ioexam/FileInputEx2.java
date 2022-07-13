package ioexam;

import java.io.FileInputStream;

import java.util.Arrays;

public class FileInputEx2 {

	public static void main(String[] args) {
		/*
		 * read(byte[])을 이용해서 파일을 읽어봅시다.
		 */
		FileInputStream fis = null;
		byte[] data = new byte[5];

		try {
			fis = new FileInputStream("test.dat");
			while (true) {
				int reads = fis.read(data);
				if (reads == -1)break;
				System.out.println(reads);
				System.out.println(Arrays.toString(data));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
