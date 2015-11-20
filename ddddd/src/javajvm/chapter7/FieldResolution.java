package javajvm.chapter7;

public class FieldResolution {
	interface Interface0 {
		int A = 0;
	}
	interface Interface1 extends Interface0 {
		int A = 1;
	}
	interface Interface2 {
		int A = 2;
	}
	static class Parent implements Interface1 {
		public static int A = 3;
	}
	static class Sub extends Parent implements Interface2 {
		public static int A = 4;
	}
	static class TT implements Interface1{
		
	}
	
	public static void main(String[] args) {
		/*
		 * 如果继承的父类和实现的接口都有同一个静态变量，而且子类又没有自己定义此变量，
		 * 编译的时候就会报错
		 * 接口定义的变量，默认就是public static的
		 */
		System.out.println(Sub.A);
		System.out.println(TT.A);
		System.out.println(Interface0.A);
	}
}
