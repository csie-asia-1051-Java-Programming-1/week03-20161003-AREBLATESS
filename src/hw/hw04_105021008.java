package hw;

//讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
import java.util.Scanner;
public class hw04_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=1;
		while(a>0){
			b=b*(a--);
		}System.out.println(b);
	}

}
