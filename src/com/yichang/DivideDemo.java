package com.yichang;

public class DivideDemo {

	public static void main(String[] args) {
		int m= 0,n =0;
		try{
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[0]);
			int result = m/n;
			System.out.println(m+"除以"+n+"的结果是"+result);
		}
		catch(ArrayIndexOutOfBoundsException e){//捕获数组下标越界异常
			System.out.println(e.toString());
		System.out.println("数组元素引用越界，输入的命令行参数不够吧！");
			
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
			System.out.println("除数不能为0！");
		}
		catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
