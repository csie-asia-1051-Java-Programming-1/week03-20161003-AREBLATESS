package hw;

//���ϥΪ̿�J�@�����n�A��for�j��p��n!���X
import java.util.Scanner;
public class hw03_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=1;
		for(int i=a;i>0;i--){
			b=a*(i)*b;}
		System.out.println(b/Math.pow(a,a));
	}

}