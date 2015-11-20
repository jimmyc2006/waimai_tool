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
		 * ����̳еĸ����ʵ�ֵĽӿڶ���ͬһ����̬����������������û���Լ�����˱�����
		 * �����ʱ��ͻᱨ��
		 * �ӿڶ���ı�����Ĭ�Ͼ���public static��
		 */
		System.out.println(Sub.A);
		System.out.println(TT.A);
		System.out.println(Interface0.A);
	}
}
