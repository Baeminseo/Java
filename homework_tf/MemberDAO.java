package homework_tf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * DAO 클래스...
 * 대부분의 비즈니스 로직을 담당하는 클래스 입니다.
 * 사용자 회원가입(생성), 로그인, 승률 정보등의 정보를 작업합니다...
 * 지금은 File 에 대해서 작업을 하지만, DB 에 작업시 사용합니다.
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

	public int doWork() {// 회원 가입일지, 사용자 정보를 세팅일지 한번에 처리하는 메서드
		int result = 0;// 결과값 Flag ... 예외 0, OK 1
		if (this.player instanceof Member) {// 로그인 사용자 객체인 경우 파일 생성
			result = joinNewMember((Member) player);
		} else if (this.player instanceof PlayerInfo) {

		}
		return result;
	}

	// 신규 회원 가입 메서드
	private int joinNewMember(Member member) {
		int result = 0;// 결과값 flag.. 모두 OK 1, 예외 0

		if (!root.exists() || !root.isDirectory()) {
			root.mkdir();
		} else {
			File newMember = new File(root, member.getID() + ".dat");// Parent Folder 하위에 생성할 사용자 Email 정보 획득..

			if (br == null && fw == null) {
				try {
					fw = new FileWriter(newMember);
					bw = new BufferedWriter(fw);
					bw.write("Email : " + member.getEmail() + "\n");
					bw.write("Passwd : " + member.getPasswd());
					bw.close();
					result = 1;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println("사용자 생성 예외 발생함..");
					System.out.println(e.getMessage());
				}

			}
		}

		return result;
	}

	// 로그인 메서드..
	public int logIn(Member member) {
		System.out.println("호출됨..");
		int result = -1; // ID 없음, 0 Pass 틀림, 1 OK
		File[] fileList = root.listFiles();

		System.out.println("LLL" + fileList.length);
		String id = member.getID() + ".dat";
		System.out.println("ID ---> " + id);

		String passwd = null;
		long lastLogInTime = System.currentTimeMillis();
		int differ = 0;

		File thePlayer = null;

		for (int i = 0; i < fileList.length; i++) {
			thePlayer = fileList[i];
			System.out.println(thePlayer.getName());
			if (thePlayer.getName().equals(id)) {
				result = 0;
				break;
			}
		}

		try {
			FileReader fr = new FileReader(thePlayer.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);
			String msg = null;
			while ((msg = br.readLine()) != null) {
				if (msg.startsWith("Passwd")) {
					passwd = msg.substring(msg.indexOf(":") + 1, msg.length());
					if (passwd.equals(member.getPasswd())) {
						result = 1;
					}
				}
				if (msg.startsWith("logInTime")) {
					lastLogInTime = Long.parseLong(msg.substring(msg.indexOf(":") + 1, msg.length()));
				}
			}
				SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				String last = timeFormat.format(new Date(lastLogInTime));
				//현재 로그인시간 다시 세팅해야함.
				String pass = timeFormat.format(new Date(Gawibawibo.passlogin));

				System.out.println("암호 : " + passwd);
				System.out.println("마지막 로그인 시간 : " + last);
				
			if (lastLogInTime != 0) {
				// 로그인 편차 구하기..
				long diffSec = (lastLogInTime-Gawibawibo.passlogin);
				long diffDays = diffSec / (24*60*60);
				System.out.println("패스워드 설정한지 "+diffSec+"초 지났습니다.");
				if(diffDays > 1) {
					System.out.println("패스워드 설정한지 1일을 경과했습니다. 패스워드를 변경시켜주세요.");
				}
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("회원조회 => " + result);
		return result;

	}
}
