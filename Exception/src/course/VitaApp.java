package course;
import java.util.*;
import java.util.Scanner;

public class VitaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dac d=new Dac();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers for add operation");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		d.term1(num1,num2);
		System.out.println("Enter Message");
		String msg=sc.next();
		d.term2(msg);
		PreDac pd= new PreDac();
		System.out.println("Enter two Numbers for sub operation");
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		pd.term1(num3,num4);
		Basic b=new Basic();
		b.finalTest();
		
	}

}
