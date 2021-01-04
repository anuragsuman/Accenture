package com.synechron.prepration;
import java.io.Serializable;
import java.lang.reflect.Field;

final class ImBean implements Serializable{
	private final String name;
	public ImBean(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

public class ImmutableBean {

//	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
//		ImBean im = new ImBean("Anurag");
//		System.out.println("Old Value:"+im.getName());
//		Field nameFiled = im.getClass().getDeclaredField("name");
//		nameFiled.setAccessible(true);
//		nameFiled.set(im,"Ravi");
//		System.out.println("New Value:"+im.getName());
//	}
	
	public static void main(String args[]) {
		ImBean im = new ImBean("Anurag");
		System.out.println("Old Value:"+im.getName());
		
	}

}
