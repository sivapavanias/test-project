package com.stringbufferex;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="pk";
		String str1="pk";
		System.out.println(str1);
		StringBuffer str2=new StringBuffer("gk");
		StringBuffer str3=new StringBuffer("gk");
		System.out.println(str3.indexOf(str1));//1
		System.out.println(str3.capacity());//2
		System.out.println(str3.append('b'));//3
		System.out.println(str3.reverse());//4
		//System.out.println(str3.replace('g', 'k', str3));//1
		System.out.println(str3.append(1));
		System.out.println(str3.append(1.0));
		System.out.println(str3.delete(0, 1));
		System.out.println(str3.deleteCharAt(0));
		System.out.println(str3.codePointAt(0));
		System.out.println(str3.codePointBefore(1));
		System.out.println(str3.codePointCount(1, 1));
		System.out.println(str3.indexOf(str2));
		System.out.println(str3.lastIndexOf(str1));
		System.out.println(str3.lastIndexOf(str1, 0));
		System.out.println(str3.length());
		System.out.println(str3.substring(0));
		System.out.println(str3.substring(0, 1));
		System.out.println(str3.toString());
		System.out.println(str3.append(1));
		System.out.println(str3.insert(0, 'c'));
		System.out.println(str3.subSequence(0, 1));
		System.out.println(str3.substring(0, 1));
		str3.setLength(1);
		str3.setCharAt(0, 'c');
		str3.trimToSize();
		
		/*System.out.println(str2);
		
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		
		char array[]= {'a','e'};
		String atrc=new String(array);
		System.out.println(array);
		*/

	}

}
