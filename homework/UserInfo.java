package homework;
//결과값 받기
public class UserInfo extends GawiBawiBo{
	public UserInfo() {
	}
	
	private static int win;
	private static int draw;
	private static int lose;
	private int gameCount;
	private double record;
	public UserInfo(int win, int draw, int lose, int gameCount, double record) {
		super();
		this.win = win;
		this.draw = draw;
		this.lose = lose;
		this.gameCount = gameCount;
		this.record = record;
		
	}
	public static int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
		
	}
	public static int getdraw() {
		return draw;
	}
	public void set(int draw) {
		this.draw = draw;
	}
	public static int getlose() {
		return lose;
	}
	public void setlose(int lose) {
		this.lose = lose;
	}
	public int getgameCount() {
		return gameCount;
	}
	public void setgameCount(int gameCount) {
		this.gameCount = gameCount;
	}
	public double getrecord() {
		return record;
	}
	public void setrecord(int record) {
		this.record = record;
	}
	//배열에 총전적 값 넣기
	public void addScore(int index, int theScore) {
		int winCount = 0;
		int drawCount = 0;
		int loseCount = 0;
		if (index < 3) {
			scoreArrays[index] = theScore;
			if (theScore == win) {
				winCount += 1;
				gameCount += 1;
			}else if (theScore == draw) {
				drawCount += 1;
				gameCount += 1;
			}else if (theScore == lose) {
				loseCount += 1;
				gameCount += 1;
			}
		}else {
			record =(winCount/gameCount)*100;
			System.out.print("당신의 점수 결과 --> "+gameCount+"전 "+winCount+"승 "+drawCount+"무"+loseCount+"패");
			System.out.println("승률 : "+ record + "입니다.");
		}
	}
}
