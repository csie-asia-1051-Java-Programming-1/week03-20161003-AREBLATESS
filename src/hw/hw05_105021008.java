package hw;

import java.util.Scanner;

//���ϥΪ̿�J�@�����n�A�p��1(1+1) + 2(2+1) + 3(3+1) + �K + n(n+1)�ÿ�X���G�C
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
