package org.j2eedev.designpatterns.creational.singleton;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 */
public class LazySingleton {
  
  private static LazySingleton _INSTANCE;
	// Marking default constructor private
	// to avoid direct instantiation.
	private LazySingleton() {

	}
	// Get instance for class LazySingleton
	public static LazySingleton getInstance() {
		if(_INSTANCE==null){
			_INSTANCE=new LazySingleton();
		}
		return _INSTANCE;
	}
}
