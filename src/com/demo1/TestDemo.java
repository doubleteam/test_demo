package com.demo1;

public interface TestDemo {
	public static String sum() {
		return "这俩方法写的对吗？";
	}
	
	public default String getValue() {
		return "为什么这个接口不报错？";
	}
}
