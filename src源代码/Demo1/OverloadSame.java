package com.hs_vae.Demo1;
//Date:2020.9.28 利用方法重载判断四个类型的两个数是否相等。
public class OverloadSame {
	public static void main(String[] args) {
	
	//方法重载,判断byte short int long 类型的两个数是否相等
    System.out.println(isSame((byte)66,(byte)66));  //因为java默认整数类型为int，所以得强转byte类型，下面的short也一样
    System.out.println(isSame(66,66));
	System.out.println(isSame((short)66,(short)66));
	System.out.println(isSame(66L,66L));            //long类型数字后缀记得要带上个L，此外float类型后缀记得带上F
	}
	//判断byte类型的两个数是否相等
	public static boolean isSame(byte a,byte b) {
		System.out.println("两个byte参数的方法执行！");
		boolean same;
		if(a == b) {
			same = true;
		}else {
			same = false;
		}
		return same;
	}
	
	//判断short类型的两个数是否相等
   public static boolean isSame(short a,short b) {
		System.out.println("两个short参数的方法执行！");
	   boolean same;
	   same = a==b?true:false;
	   return same;
   }
   
   //判断int类型的两个数是否相等
   public static boolean isSame(int a,int b) {
		System.out.println("两个int参数的方法执行！");
	   return a==b;
   }
  
   //判断long类型的两个数是否相等
   public static boolean isSame(long a,long b) {
		System.out.println("两个long参数的方法执行！");
	    if(a==b) {
	    	return true;
	    }else 
	    {
	    	return false;
	    }
   }
}
