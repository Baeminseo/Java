package ioexam;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 2가지만 기억할 것
 * 1. 쓴 순서 그대로 읽어들여야합니다.
 * 2. EOP 예외를 통해 파일의 끝 또는 데이터의 끝점을 확인하여 후처리를 합니다.
 */
public class DataInputExam {

	public static void main(String[] args) {

		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		//FileInputStream 을 한번만 사용하고 끝낼때는 아래처럼 사용해도 됩니다.
		//dis = new DataInputStream(new FileInputStream("score.dat"));
		try {
			fis = new FileInputStream("score.dat");
			dis = new DataInputStream(fis);
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
		} catch (EOFException eoe) {
			//DataInputStream이 파일의 끝을 다다르면 이 예외를 발생시킵니다.
			System.out.println("점수의 총합 : "+sum);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
