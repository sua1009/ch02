package ch02;

public class ExplicitConversion {
	public void explicitConversion() {
		
		System.out.println("----------���� Ÿ�� ��ȯ-----------");
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
//		���� Ÿ�� ��ȯ�� ���ؼ� int Ÿ������ ��ȯ�� 
		int iNum3 = (int)dNum1+ (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		float dNum2 = (float)dNum1 + fNum2;
		System.out.println(dNum2);
		

	}

}
