package javaxuniji.classloading;

/**
 * 被动使用类字段演示三
 * 常量在变异阶段会存入调用类的常量池，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类
 * 的初始化
 * @author shuwei_iwm
 *
 */
public class ConstClass {
	static {
		System.out.println("ConstClass init!");
	}
	public static final String HELLOWORLD = "hello world";
	public static String NOTFINALHELLOWORLD = "hello world";
}
