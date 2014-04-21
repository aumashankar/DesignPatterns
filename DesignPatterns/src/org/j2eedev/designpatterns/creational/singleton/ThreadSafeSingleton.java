package org.j2eedev.designpatterns.creational.singleton;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 *
 */
public class ThreadSafeSingleton {
  
  private static ThreadSafeSingleton _INSTANCE;
	// Marking default constructor private
	// to avoid direct instantiation.
	private ThreadSafeSingleton() {

	}
	// Get instance for class ThreadSafeSingleton
	public static synchronized ThreadSafeSingleton getInstance() {
		if(_INSTANCE==null){
			_INSTANCE=new ThreadSafeSingleton();
		}
		return _INSTANCE;
	}
	//clone() can spoil the game! so override it.
	public Object clone() throws CloneNotSupportedException {
	      throw new CloneNotSupportedException();
	}
}
