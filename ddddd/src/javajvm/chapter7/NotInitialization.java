package javajvm.chapter7;

public class NotInitialization {
	/**
	 * �����������ֶ���ʾһ
	 * ͨ���������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
	 */
	public static void main1(String[] args) {
		System.out.println(SubClass.value);
	}
	
	/*
	 * ����ʹ�����ֶ���ʾ��
	 * ͨ�����鶨���������࣬���ᴥ������ĳ�ʼ��
	 */
	public static void main2(String[] args) {
		SuperClass[] sca = new SuperClass[10];
	}
	/*
	 * ����ʹ�����ֶ���ʾ����
	 * �����ڱ���׶λ���������ĳ������У�������û��ֱ�����õ����峣�����࣬
	 * ��˲��ᴥ�����峣������ĳ�ʼ��
	 */
	public static void main(String[] args) {
		System.out.println(ConstClass.HELLOWORD);
	}
}
