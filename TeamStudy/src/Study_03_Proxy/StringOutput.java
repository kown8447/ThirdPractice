package Study_03_Proxy;

import java.util.Scanner;

public class StringOutput implements Output {

	@Override
	public String strout() {
		
		String str = null;
		Scanner sc = new Scanner(System.in); 
		System.out.print("문자열을 입력하세요 : ");
		str = sc.nextLine();
		return str;
	}

}
