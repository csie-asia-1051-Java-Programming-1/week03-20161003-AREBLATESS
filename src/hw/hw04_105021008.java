package hw;

//���ϥΪ̿�J�@�����n�A��while�j��p��n!���X�C
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
