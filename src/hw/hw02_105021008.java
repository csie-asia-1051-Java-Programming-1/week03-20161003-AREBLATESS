package hw;

//琵ㄏノ块计参璸タ计璽计の箂Τぶ
import java.util.Scanner;
public class hw02_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int positive =0;
		int negative=0;
		int ze=0;
		char checkChar;
		while(true){
			int a=scn.nextInt();
			if(a>0){
				positive++;
			}else if(a==0){
				ze++;
			}else if(a<0){
				negative++;
			}
			System.out.println("琌膥尿(ヴ種ン/N)");
			checkChar=scn.next().charAt(0);
			if(checkChar=='N'||checkChar=='n'){
				System.out.println("タ计"+positive+"");
				System.out.println("璽计"+negative+"");
				System.out.println("箂Τ"+ze+"");
				System.out.println("3Q");
				break;
			}
		}

	}

}
