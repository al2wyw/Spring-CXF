package xpadro.tutorial.rest.config;

import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.Assert;
import org.springframework.util.PropertyPlaceholderHelper;

public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer{

	private MyPlaceholder helper = new MyPlaceholder();

	public MyPlaceholder getHelper() {
		return helper;
	}

	public void setHelper(MyPlaceholder helper) {
		this.helper = helper;
	}

	@Override
	protected String resolvePlaceholder(String placeholder, Properties props) {
		if(helper==null)
			System.out.println("helper is null");
		if(helper!=null)
			return helper.replacePlaceholders(placeholder, props);
		else
			return super.resolvePlaceholder(placeholder, props);
	}
	
	private class MyPlaceholder extends PropertyPlaceholderHelper{

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
	
}
