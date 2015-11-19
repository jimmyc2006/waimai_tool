package javaxuniji.classloading;

public class NotInitialization {
	/**
	 * 对于静态字段，只有直接定义这个字段的类才会被初始化
	 * @param args
	 */
	public static void main1(String[] args) {
		System.out.println(SubClass.value);
	}
	
	/**
	 * 并没有对SuperClass类进行初始化,而是初始化了一个数组类
	 * @param args
	 */
	public static void main2(String[] args) {
		@SuppressWarnings("unused")
		SuperClass[] sca = new SuperClass[10];
	}
	
	/**
	 * 非主动使用类字段演示
	 * 用final修饰的常量会放入常量池，引用的时候不会初始化class
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ConstClass.HELLOWORLD);
		System.out.println(ConstClass.NOTFINALHELLOWORLD);
	}
}