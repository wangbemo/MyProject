package com.xst.po;

public class SingletonClass{
	
	private static class SingletonClassInstance{
		private static final SingletonClass sc = new SingletonClass();
	}
	
	public static SingletonClass getInstsance(){
		return SingletonClassInstance.sc;
	}
	
	private SingletonClass(){
		
	}
	
}