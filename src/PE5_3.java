import java.util.Scanner;

public class PE5_3 {

	public static void main(String[] args) {
	 System.out.println("Give NUmber");
	 Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		in.close();
      
	

	Selector selector=new Selector() {
		
	public void next(int x) {
		for(int i=x;i>0;i--)
		System.out.print((i-1)+"\t");
		
	}
	};
	selector.next(a);
}
}
interface Selector{
	void next(int x);
}