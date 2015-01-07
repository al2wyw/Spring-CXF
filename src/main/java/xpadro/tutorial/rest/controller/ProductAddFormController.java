package xpadro.tutorial.rest.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import xpadro.tutorial.rest.model.Product;
import xpadro.tutorial.rest.repository.WarehouseRepository;

@Controller
public class ProductAddFormController {
	
	@Autowired
	private WarehouseRepository warehouseRepository;
	
	@RequestMapping(value="/Product", method=RequestMethod.GET)
	public String showForm(Model map){
	    map.addAttribute("product", new Product());
	    map.addAttribute("option", "option for show the form");
		return "spring";
	}
	
	@RequestMapping(value="/Product", method=RequestMethod.POST)
	public String postForm(@Valid @ModelAttribute("product") Product product,BindingResult errors,Model map){
		if(errors.hasErrors()){
			System.out.println("test");
			return "addFail";
		}
		warehouseRepository.addProduct(1, product); //hardcode warehouse id
		return "redirect:addResult"; //must have a requestmapping resolver
	}
	
	@RequestMapping(value="/addResult", method=RequestMethod.GET)
	public String showResult(){
		return "addResult";
	}
	
	@InitBinder
	public void setHeaders(HttpServletResponse response){
		response.setHeader("Pragma", "no-cache");
        //response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
        response.addHeader( "Cache-Control", "must-revalidate" );
	    response.addHeader( "Cache-Control", "no-cache" );
	    response.addHeader( "Cache-Control", "no-store" );
        response.setDateHeader("Expires", 0);
	}
	
	@InitBinder
	public void resolveLocale(Locale locale, HttpServletResponse response, HttpServletRequest request){
		System.out.println(locale.getLanguage());
		if(locale.getLanguage()!="ch"){
			locale = Locale.ENGLISH;
			LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request); 
			if (localeResolver == null) {  
			    throw new IllegalStateException("No LocaleResolver found: not in a DispatcherServlet request?");  
			} 
			localeResolver.setLocale(request, response, locale);
		}
		System.out.println(locale.getLanguage());
	}
}
