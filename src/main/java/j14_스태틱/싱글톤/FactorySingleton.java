package j14_스태틱.싱글톤;

public class FactorySingleton {

	private static FactorySingleton instance = null;

	private FactorySingleton() {

	}

	public static FactorySingleton getInstance() {
		if (instance == null) {
			instance = new FactorySingleton();
		}
		return instance;
	}
}
