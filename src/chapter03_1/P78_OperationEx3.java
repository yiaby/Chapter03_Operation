package chapter03_1;

public class P78_OperationEx3 {
//단락 회로 평가 실습 하기
	/*
	 * 논리연산자
	 * &&(논리곱 :둘다 참) ||(논리 합: 하나만 참) !(부정 : 참이면 거짓 거짓이면 참)
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		//논리 곱에서 앞 항의 결과 값이 거짓이므로 ((i = i + 2) < 10'은 실행되지 않음
		System.out.println(value);      //false
		System.out.println(num1);		//20
		System.out.println(i);			//2
		
		value = ((num1 = num1 + 10)> 10) || ((i = i +  2)<10);
		//논리 합에서 앞 항의 결과 값이 참이므로 ((i = i +  2)<10)은 실횅 되지 않음
		System.out.println(value);		//true
		System.out.println(num1);		//30
		System.out.println(i);			//2

	}

}
