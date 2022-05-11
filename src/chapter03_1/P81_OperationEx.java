package chapter03_1;

public class P81_OperationEx {
//조건 연산자를 사용하여 부모님의 나이 비교하기
	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge)?'T':'F';
		
		System.out.println(ch);

	}

}
