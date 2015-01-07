package xpadro.tutorial.rest.util;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.PropertyPlaceholderHelper;

@Component
public class MyPlaceholder extends PropertyPlaceholderHelper{

	private final Pattern pattern = Pattern.compile("fuck");
	
	public MyPlaceholder(String placeholderPrefix, String placeholderSuffix){
		super(placeholderPrefix, placeholderSuffix);
	}
	
	public MyPlaceholder(String placeholderPrefix, String placeholderSuffix,
			String valueSeparator, boolean ignoreUnresolvablePlaceholders){
		super(placeholderPrefix, placeholderSuffix,valueSeparator, ignoreUnresolvablePlaceholders);
	}
	
	public MyPlaceholder(){
		super("${", "}");
		System.out.println("my place holder constructed");
	}

	@Override
	protected String parseStringValue(String arg0, PlaceholderResolver arg1,
			Set<String> arg2) {
		Assert.notNull(arg0, "string must not be null");
		StringBuilder result = new StringBuilder(arg0);
		Matcher m = pattern.matcher(result);
		while(m.find()){
			result = result.replace(m.start(), m.end(), "good");
		}
		return super.parseStringValue(result.toString(), arg1, arg2);
	}
	
	
}
