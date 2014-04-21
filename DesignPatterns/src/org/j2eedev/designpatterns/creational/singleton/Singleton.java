package org.j2eedev.designpatterns.creational.singleton;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 *
 */
public class Singleton {
  
  private static Singleton _INSTANCE = new Singleton();

	// Marking default constructor private
	// to avoid direct instantiation.
	private Singleton() {

	}

	// Get instance for class Singleton
	public static Singleton getInstance() {
		return _INSTANCE;
	}
}
