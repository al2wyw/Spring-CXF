package xpadro.tutorial.rest.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class PerformanceLogAspect {
	 public Object profile(ProceedingJoinPoint jp){
	        StopWatch task = new StopWatch();
	        task.start("profile the method "+jp.getSignature().getName());
	        try{
	           return jp.proceed();
	        }catch (Throwable e)
	        {
	            e.printStackTrace();
	        }finally {
	            task.stop();
	            System.out.println(task.prettyPrint());
	        }
	        return null;
	    }
}
