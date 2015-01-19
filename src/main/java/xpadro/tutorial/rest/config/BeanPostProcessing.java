package xpadro.tutorial.rest.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import xpadro.tutorial.rest.model.PropertyChangedBean;
@Component
public class BeanPostProcessing implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if(beanName.equals("propertyChangedBean")){
			((PropertyChangedBean)bean).setBean(null);
			System.out.println("set the property to null");
		}
		return bean;
	}
	
}
