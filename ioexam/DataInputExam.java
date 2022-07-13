package ioexam;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 2������ ����� ��
 * 1. �� ���� �״�� �о�鿩���մϴ�.
 * 2. EOP ���ܸ� ���� ������ �� �Ǵ� �������� ������ Ȯ���Ͽ� ��ó���� �մϴ�.
 */
public class DataInputExam {

	public static void main(String[] args) {

		int sum = 0;
		int score = 0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		//FileInputStream �� �ѹ��� ����ϰ� �������� �Ʒ�ó�� ����ص� �˴ϴ�.
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
			//DataInputStream�� ������ ���� �ٴٸ��� �� ���ܸ� �߻���ŵ�ϴ�.
			System.out.println("������ ���� : "+sum);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
