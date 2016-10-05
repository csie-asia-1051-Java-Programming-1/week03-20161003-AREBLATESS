package hw;

//輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
import java.util.Scanner;
public class hw01_105021008 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int ans=0;
		int x=1;
		for(int i=0;a/10>0;i++){
			a=a/10;
			ans=ans+x;}
		System.out.print(ans+1);
	}

}
