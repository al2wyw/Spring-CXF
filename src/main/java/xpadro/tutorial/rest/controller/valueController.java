package xpadro.tutorial.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import xpadro.tutorial.rest.model.PlaceholderConfigBean;

@Controller
public class valueController {
	@Value("#{propertiesReader.myconfig}")//@Value("#{propertiesReader['myconfig']}")
	private String test;
	
	@Autowired
	@Qualifier("placeholderConfigBean")
	private PlaceholderConfigBean bean;
	
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
	
}
