package 람다식;

public class UsingLocalVariable {
	void method(int arg) { // 묵시적 final 특성
		int localVar = 40; // 묵시적 final 특성

//		arg = 30;
//		localVar = 41;

		// 람다식
		MyFunctionalInterface mi = () -> {
			System.out.println("arg: " + arg); // 익명 객체에서는 로컬 변수들이 final로 취급됨
			System.out.println("localVar: " + localVar);
		};
		mi.method();
	}
}
