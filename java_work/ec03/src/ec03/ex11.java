package ec03;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("숫자입력");
		double d = scan.nextDouble();
		System.out.println("d="+d);
		
		double trans_d=(int)(d*100)/100.0;
		System.out.println("trans_d="+trans_d);
		
	}

}
