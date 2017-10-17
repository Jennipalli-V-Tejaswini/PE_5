import java.util.Scanner;



public class PE5_6 {

	public static void main(String[] args) {
		
		System.out.println("Give number");
		Scanner in =new Scanner(System.in);
		int i=in.nextInt();
		in.close();
		
		GetNumber myLengthLambda=(int s)->(s*2);
		System.out.println(myLengthLambda.multipliedValue(i));
	}


interface GetNumber{
	int multipliedValue(int s);
}

}
