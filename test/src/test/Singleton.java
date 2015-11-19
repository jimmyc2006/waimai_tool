package test;

public class Singleton {
	private static final Singleton INSTANCE  = new Singleton();
	private Singleton(){}
	public static Singleton getInstance() {
		return INSTANCE;
	}
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
	}
}
