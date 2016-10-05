package hw;

import java.util.Scanner;

//讓使用者輸入一正整數n，計算1(1+1) + 2(2+1) + 3(3+1) + … + n(n+1)並輸出結果。
public class hw05_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=0;
		for(int i=a;i>0;i--){
			b=i*(i+1)+b;}
		System.out.println(b);
	}

}
