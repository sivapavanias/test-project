package com.stringbufferex;

public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str3=new StringBuffer("sivapavani");
		StringBuffer str1=new StringBuffer("siva");
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
		System.out.println(str3.indexOf(str1));
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

	}

}
