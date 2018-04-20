package com.xyf.nio.iface;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
	public List<String> list = new ArrayList<String>();
	Properties properties = new Properties();
	
	
	public App(){
		list.add("1");
		properties.setProperty("key", "hhh");
	}
	
	public void test() {
		System.out.println(properties.getProperty("key"));
	}
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        System.out.println(app.list.toString());
        app.test();
    }
}
