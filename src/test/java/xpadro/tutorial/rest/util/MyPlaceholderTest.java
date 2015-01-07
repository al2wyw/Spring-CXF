package xpadro.tutorial.rest.util;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
 
public class MyPlaceholderTest {
	private MyPlaceholder test;
	@Test
	public void testParseStringValueWithFuck() throws Exception{
		test = new MyPlaceholder("${","}");
		Properties properties = new Properties();
		properties.setProperty("mygoodtestgoodok", "test");
		String result=test.replacePlaceholders("${myfucktestfuckok}", properties);
		Assert.assertEquals(result, "test");
	}
}
