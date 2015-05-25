package demo_test;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class testReadWriteLockWithLevelUp {

	public static void main(String[] args) {

		ReadWriteLock lock = new ReentrantReadWriteLock();
		lock.readLock().lock();
		System.out.println("get the read lock");
		//can not work
		lock.writeLock().lock();
		System.out.println("get the write lock");
		lock.writeLock().unlock();
		System.out.println("release the write lock");
		lock.readLock().unlock();  
		System.out.println("release the read lock");
	}

}
