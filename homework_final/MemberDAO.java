package homework_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * DAO Ŭ����...
 * ��κ��� ����Ͻ� ������ ����ϴ� Ŭ���� �Դϴ�.
 * ����� ȸ������(����), �α���, �·� �������� ������ �۾��մϴ�...
 * ������ File �� ���ؼ� �۾��� ������, DB �� �۾��� ����մϴ�.
 */
public class MemberDAO {
	
	private PlayerInfo player;
	private static String theParentFolder = "C:\\Players"; 
	
	private static File root = new File(theParentFolder);;
	
	FileWriter fw;
	BufferedWriter bw;
	FileReader fr;
	BufferedReader br;
	
	public MemberDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public MemberDAO(PlayerInfo player) {
		this.player = player;
	}
	
	public int doWork() {//ȸ�� ��������, ����� ������ �������� �ѹ��� ó���ϴ� �޼���
		int result = 0;//����� Flag ... ���� 0, OK 1
		if(this.player instanceof Member) {//�α��� ����� ��ü�� ��� ���� ����
			result = joinNewMember((Member)player);
		}else if(this.player instanceof PlayerInfo) {
			
		}
		return result;
	}

	//�ű� ȸ�� ���� �޼���
	private int joinNewMember(Member member) {
		int result = 0;//����� flag.. ��� OK 1, ���� 0
		
		if(!root.exists() || !root.isDirectory()) {
			root.mkdir();
		}else {
			File newMember = new File(root,member.getID() + ".dat");//Parent Folder ������ ������ ����� Email ���� ȹ��..
			
			if(br == null && fw == null) {
				try {
					fw = new FileWriter(newMember);
					bw = new BufferedWriter(fw);
					bw.write("Email : " + member.getEmail() +"\n");
					bw.write("Passwd : " + member.getPasswd());
					bw.close();
					result = 1;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("����� ���� ���� �߻���..");
					System.out.println(e.getMessage());
				}
				
			}
		}
		
		return result;
	}
	//�α��� �޼���..
	public int logIn(Member member) {
//		File[] files = theFile.listFiles();
//		for (int i = 0; i < files.length; i++) {
//			String loginid = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
//			File thePlayer = files[i];
//			String id = thePlayer.getName();
//			if (id.equals(loginid)) {
//				String loginpw = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
//				if (loginpw.equals(password)) {
//					JOptionPane.showMessageDialog(null, id + "�� �α��� �Ϸ�Ǿ����ϴ�.");
//					pwtime(theFile);
//
//				} else {
//					JOptionPane.showMessageDialog(null, id + "�� ��й�ȣ�� Ʋ�Ƚ��ϴ�. ���Է����ּ���.");
//				}
//			} else {
//				JOptionPane.showMessageDialog(null, "���̵� Ʋ�Ƚ��ϴ�. ���Է����ּ���.");
//				continue;
//			}
//		}
		System.out.println("ȣ���..");
		int result = -1; //ID ����, 0 Pass Ʋ��, 1 OK
		File[] fileList = root.listFiles();
		
		System.out.println("LLL" + fileList.length);
		String id = member.getID()+".dat";
		System.out.println("ID ---> " + id);
		
		String passwd = null;
		long lastLogInTime = 0;
		int differ = 0;
		
		File thePlayer = null;
		
		for(int i = 0; i<fileList.length; i++) {
			thePlayer = fileList[i];
			System.out.println(thePlayer.getName());
			if(thePlayer.getName().equals(id)) {
				result = 0;
				break;
			}
		}
		
		try {
			FileReader fr = new FileReader(thePlayer.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
			String msg = null;
			while((msg = br.readLine())!= null) {
				if(msg.startsWith("Passwd")) {
					passwd = msg.substring(msg.indexOf(":")+1, msg.length());
					if(passwd.equals(member.getPasswd())) {
						result = 1;
					}
				}
				if(msg.startsWith("logInTime")) {
					lastLogInTime = Long.parseLong(msg.substring(msg.indexOf(":")+1, msg.length()));
				}
			}
			System.out.println("��ȣ : " + passwd);
			System.out.println("������ �α��� �ð� : " + lastLogInTime);
			
			if(lastLogInTime != 0) {
				//�α��� ���� ���ϱ�..
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ȸ����ȸ => " + result);
		return result;
		
	}
}






























