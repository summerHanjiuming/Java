package com.yichang;

public class DivideDemo {

	public static void main(String[] args) {
		int m= 0,n =0;
		try{
			m = Integer.parseInt(args[0]);
			n = Integer.parseInt(args[0]);
			int result = m/n;
			System.out.println(m+"����"+n+"�Ľ����"+result);
		}
		catch(ArrayIndexOutOfBoundsException e){//���������±�Խ���쳣
			System.out.println(e.toString());
		System.out.println("����Ԫ������Խ�磬����������в��������ɣ�");
			
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
			System.out.println("��������Ϊ0��");
		}
		catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
