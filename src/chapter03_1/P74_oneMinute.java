package chapter03_1;

public class P74_oneMinute {
 //국어,수학,영어 변수를 선언뒤 원하는 값을 추가하고 총점(totalScore)과 평균(avgScore)을 구해 보세요.
	public static void main(String[] args) {
		int korScore = 88;
		int engScore = 90;
		int mathScore = 100;
		
		int totalScore = korScore + engScore + mathScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
        System.out.println(avgScore);
	}

}
