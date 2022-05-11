package chapter03_1;

public class P75_OperationEx2 {
     /*
      * 4.증가,감소 연산자:
      *  =>단항 연산자,연산자 앞이나 뒤에 사용하면 값을 1만큼 늘리거나 1만큼 줄임
      */
	public static void main(String[] args) {
		int gameScore = 150;				//게임에서 획득한 점수는 150점
		
		int lastScore1 = ++gameScore;		//gameScore에 1만큼 더한 값을 lastScore1에 대입
		System.out.println(lastScore1);     //151
		
		int lastScore2 = --gameScore;		//gameScore에 1만큼 뺀 값을 lastScore2에 대입
		System.out.println(lastScore2);		//150
		
		
		

	}

}
