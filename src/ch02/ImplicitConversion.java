package ch02;

public class ImplicitConversion {
	public void implicitConversion() {
		System.out.println("-------------�ڵ� ����ȯ ------------");
		byte bNum = 10;
		int iNum = bNum;  //byte --> int�� �ڵ� ����ȯ
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;  // 4byte
		float fNum = iNum2;  // 4byte �Ǽ��� 
//		���������� �Ǽ����� �� ū ������ Ÿ��
//		int  -> float ���� �ڵ� ����ȯ �� 
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;	//ū ������ Ÿ�԰� ���� ������ Ÿ���� ������ ��� ū ������ Ÿ������ �ڵ� Ÿ�� ��ȯ ��
//		����� ������� float Ÿ�������� ����� ������ double Ÿ������ double Ÿ������ �ڵ� ��ȯ �� 
		System.out.println(dNum);
		
		
	}
}
