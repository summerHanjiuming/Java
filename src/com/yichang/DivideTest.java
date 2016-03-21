package com.yichang;

import java.util.Scanner;

public class DivideTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int m = 0,n = 0;
		try{
			System.out.println("输入两个整数进行除法运算。");
			m = reader.nextInt();
			n = reader.nextInt();
			int result = m/n;
			System.out.println(m+"除以"+n+"的结果是"+result);
		}
		catch (Exception e){
			System.out.println("发生异常！输入的除数不能为0，不能进行除零的非法运算！");
			System.out.println(e.toString());
		}
		finally{
			System.err.println("程序运行结束。");
			
		}

	}

}
