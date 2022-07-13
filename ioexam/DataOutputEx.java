package ioexam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

/*
 * DataOutPutStream �� �ڹ��� ��� ������ (��ü ����, ���ڿ� ����)�� target �� ���� ��ü�Դϴ�.
 * writeType() �޼��带 �̿��ؼ� ����, �ش� �� �� ũ�� �״�� �������ϴ�.
 */
public class DataOutputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100,90,80,49,60};
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("score.dat");
			dos = new DataOutputStream(fos);
			
			for(int i = 0; i<score.length; i++) {
				dos.writeInt(score[i]);
			}
			dos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
