package ioexam;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

/*
 * DataOutPutStream 은 자바의 모든 데이터 (객체 제외, 문자열 포함)을 target 에 쓰는 객체입니다.
 * writeType() 메서드를 이용해서 쓰면, 해당 값 및 크기 그대로 쓰여집니다.
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
