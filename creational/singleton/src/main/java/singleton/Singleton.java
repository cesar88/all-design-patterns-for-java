package singleton;

//The Class can be instantiated only once 
public class Singleton {

	//Can be Eagerly instantiate
	private static Singleton instance;

	// Encapsulates constructor (hides) from other classes to instantiated
	private Singleton() {
	}

	// Returns the only instance, if it does not exists creates new one.
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
