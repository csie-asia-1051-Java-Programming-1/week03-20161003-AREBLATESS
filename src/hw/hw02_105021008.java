package hw;

//���ϥΪ̿�J�h�ӼơA�έp���ơB�t�Ƥιs�U���h�֭ӡC
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
			System.out.println("�O�_�~��(���N�ץ�/N)");
			checkChar=scn.next().charAt(0);
			if(checkChar=='N'||checkChar=='n'){
				System.out.println("����"+positive+"��");
				System.out.println("�t��"+negative+"��");
				System.out.println("�s��"+ze+"��");
				System.out.println("3Q");
				break;
			}
		}

	}

}
