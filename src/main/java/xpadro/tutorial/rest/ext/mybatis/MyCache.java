package xpadro.tutorial.rest.ext.mybatis;

import java.util.concurrent.locks.ReadWriteLock;

import org.apache.ibatis.cache.Cache;

public class MyCache implements Cache {
	
	public MyCache(String id) {
		System.out.println("born of my cache "+ id);
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "MyCache";
	}

	@Override
	public void putObject(Object key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getObject(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object removeObject(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ReadWriteLock getReadWriteLock() {
		// TODO Auto-generated method stub
		return null;
	}

}
