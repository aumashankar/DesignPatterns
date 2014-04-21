package org.j2eedev.designpatterns.creational;
/**
 * 
 * @author Umashankar
 * http://j2eedev.org
 *
 */
public class ThreadSafeDoubleCheckedLockingSingleton {
  
  private static ThreadSafeDoubleCheckedLockingSingleton _INSTANCE;
	// Marking default constructor private
	// to avoid direct instantiation.
	private ThreadSafeDoubleCheckedLockingSingleton() {

	}
	// Get instance for class ThreadSafeDoubleCheckedLockingSingleton
	public static  ThreadSafeDoubleCheckedLockingSingleton getInstance() {
		if (_INSTANCE == null) {
			synchronized (ThreadSafeDoubleCheckedLockingSingleton.class) {
				// double checked locking - because second check of Singleton
				// instance with lock
				if (_INSTANCE == null) {
					_INSTANCE = new ThreadSafeDoubleCheckedLockingSingleton();
				}
			}
		}
		return _INSTANCE;
	}
	//clone() can spoil the game! so override it.
	public Object clone() throws CloneNotSupportedException {
	      throw new CloneNotSupportedException();
	}
}
