package com.yichang;

import java.util.Scanner;

public class DivideTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int m = 0,n = 0;
		try{
			System.out.println("���������������г������㡣");
			m = reader.nextInt();
			n = reader.nextInt();
			int result = m/n;
			System.out.println(m+"����"+n+"�Ľ����"+result);
		}
		catch (Exception e){
			System.out.println("�����쳣������ĳ�������Ϊ0�����ܽ��г���ķǷ����㣡");
			System.out.println(e.toString());
		}
		finally{
			System.err.println("�������н�����");
			
		}

	}

}
