package chapter03_1;

public class P82_oneMinute {
//조건 연산자를 사용하여 10이 짝수인 경우에는 true, 그렇지 않으면 false를 출력 하기.
	public static void main(String[] args) {
		int num = 10;
		
		boolean value = (num% 2)==0? true:false;
		System.out.println(value);

	}

}
