package chapter03_1;

public class P76_oneMinute {
// P75_OpertationEx2에서 ++gameScore를 gameScore++로, --gameScore를 gameScore--로 바꾼뒤 출력해보기 
	public static void main(String[] args) {
		int gameScore = 150;				
		
		int lastScore1 = gameScore++;		//gameScore에  lastScore1에 대입한 후 1 증가
		System.out.println(lastScore1);     //150
		
		int lastScore2 = gameScore--;		//gameScore에  lastScore2에 대입한 후 1만큼 뺌
		System.out.println(lastScore2);		//151
		

	}

}
