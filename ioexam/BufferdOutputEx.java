package ioexam;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferdOutputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���۽�Ʈ���� �̿��ϸ� ȿ������ �����մϴ�.
		//��κ��� ���۽�Ʈ���� �̿��ؼ� in, out �� �����մϴ�.
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("123.txt");
			bos = new BufferedOutputStream(fos,5);//������ ũ�⸦ 5 byte ��ŭ �����Ѵ�. �� �ѹ��� 5 ��ŭ �ڵ����� ���ۿ� ä�����´�.
			
			for(int i ='1'; i<='9'; i++) {
				bos.write(i);
			}
			//���ͽ�Ʈ���� close() �� flush() �� ȣ���ϸ� ���������� �Ҵ�� ��Ʈ���� �޼��带 ȣ���Ͽ��ش�.
			bos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
