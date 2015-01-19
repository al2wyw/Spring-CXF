package xpadro.tutorial.rest.model;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyChangedBean implements InitializingBean {
	
	@Autowired
	private PlaceholderConfigBean bean;
	
	public void afterPropertiesSet() throws Exception {
		if(bean!=null){
			System.out.println("after properties set: "+bean.getTest());
		}
	}

	public PlaceholderConfigBean getBean() {
		return bean;
	}

	public void setBean(PlaceholderConfigBean bean) {
		this.bean = bean;
	}

}
