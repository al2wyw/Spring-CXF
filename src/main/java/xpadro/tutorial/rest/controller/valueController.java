package xpadro.tutorial.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import xpadro.tutorial.rest.model.PlaceholderConfigBean;
import xpadro.tutorial.rest.model.PropertyChangedBean;

@Controller
public class valueController {
	@Value("#{propertiesReader.myconfig}")//@Value("#{propertiesReader['myconfig']}")
	private String test;

	@Value("#{props['abc']}")
	private String abc;
	
	@Autowired
	@Qualifier("placeholderConfigBean")
	private PlaceholderConfigBean bean;
	
	@Autowired
	private PropertyChangedBean bean2;
	
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@RequestMapping(value="/value/test", method=RequestMethod.GET)
	public @ResponseBody String getValue(){
		if(test!=null)
			return test;
		else
			return "no value is injected";
	}
	
	@RequestMapping(value="/value/good", method=RequestMethod.GET)
	public @ResponseBody String getGoodValue(){
		if(bean!=null)
			return bean.getTest();
		else
			return "no value is injected";
		
	}
	
	@RequestMapping(value="/value/abc", method=RequestMethod.GET)
	public @ResponseBody String getAbcValue(){
		if(abc!=null)
			return abc; 
		else
			return "no value is injected";
		
	}
	
	@RequestMapping(value="/value/property", method=RequestMethod.GET)
	public @ResponseBody String gePropertyValue(){
		if(bean2!=null)
			return bean2.getBean().getTest();
		else
			return "no value is injected";
		
	}
	
}
