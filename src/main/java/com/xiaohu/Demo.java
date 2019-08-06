package com.xiaohu;

public class Demo {
	public static void main(String[] args) {
		String args0 = args[0];
		String args1 = args[1];
	    System.out.println("============="+args0);	
	    System.out.println("============="+args1);	
	    MyThread md = new MyThread();
	    md.start();
	    

	}

}
