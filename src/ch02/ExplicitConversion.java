package ch02;

public class ExplicitConversion {
	public void explicitConversion() {
		
		System.out.println("----------강제 타입 변환-----------");
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
//		강제 타입 변환을 통해서 int 타입으로 변환됨 
		int iNum3 = (int)dNum1+ (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		float dNum2 = (float)dNum1 + fNum2;
		System.out.println(dNum2);
		

	}

}
