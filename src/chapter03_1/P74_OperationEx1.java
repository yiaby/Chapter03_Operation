package chapter03_1;

public class P74_OperationEx1 {

	/*
	 * 연산자(operator)/항(operand)
	 * [연산자 우선순위]
	 *  =>단항연산자>이항연산자>삼항연산자
	 *  
	 *  1.대입연산자(assignment operator)
	 *   =>이항 연산자 중에 우선순위가 가장 낮음,오른쪽 변수 값이나 식의 연산 결과 값을 왼쪽 변수에 대입
	 *  2.부호 연산자
	 *   =>'+','-'를 써서 변수나 상수 값을 양수 또는 음수로 만드는 단항 연산자
	 *  3.산술 연산자
	 *   =>'+','-','*','/','%(나머지 값)'  (%의 우선 순위=/,*의 우선 순위)
	 */
	
	public static void main(String[] args) {
		

             //1.대입연산자
             int age = 24; //나이를 의미하는 age변수에 값 24를 대입함
                         
             /*
              * lValue(left value):왼쪽에 있는 변수
              *  =>항상 변수나 상수가 와야함
              * rValue(right value):오른쪽에 있는 변수
              *  =>변수나 숫자(상수)가 올 수 있음
              */
             
             //2.부호 연산자
             int num = 10;
             
             System.out.println(+num); //10
             System.out.println(-num); //-10 : 값10에 -가 붙어서 출력 되지만 num값은 실제로 바뀌지 않음
             System.out.println(num);  //10
             
             num = -num;			   //num 값을 음수로 바꿔서 다시 num에 대입함
             System.out.println(num);  //-10
             
             //3.산술 연산자
             int mathScore = 90;
             int engScore = 70;
             
             int totalScore = mathScore + engScore; //총점 구하기
             System.out.println(totalScore);
             
             double avgScore = totalScore / 2.0;    //평균구하기
             System.out.println(avgScore);
             
               
	}

}
