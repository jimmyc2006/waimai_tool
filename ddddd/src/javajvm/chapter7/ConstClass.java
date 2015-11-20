package javajvm.chapter7;

public class ConstClass {
	static {
		System.out.println("ConstClass init!");
	}
	public static final String FINALHELLOWORD = "final hello world";
	public static String HELLOWORD = "hello world";
}
