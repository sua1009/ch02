package ch02;

public class Ch02 {

	public static void main(String[] args) {
		
		ImplicitConversion conversion = new ImplicitConversion();
		conversion.implicitConversion();

		ExplicitConversion conversion2 = new ExplicitConversion();
		conversion2.explicitConversion();
		
		OperationEx1 operation = new OperationEx1();
		operation.operationEx();
		
		OperationEx2 operation2 = new OperationEx2();
		operation2.operationEx2();
	}

}
