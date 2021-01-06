package ch02;

public class OperationEx1 {
	public void operationEx() {
		
		System.out.println("------------산술 연산자 --------------");
		
		int mathScore = 90; 
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		
//		int 타입과 double 타입을 연산 시 큰 데이터 타입으로 자동타입 변환이 발생함 
		double avgScore = totalScore /2.0;
		System.out.println(avgScore);
	}

}
