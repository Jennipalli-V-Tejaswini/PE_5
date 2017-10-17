


public class PE5_5 {

	public static void main(String[] args) {
	
		StringLengthLambda myLengthLambda=s->s.length();
		System.out.println(myLengthLambda.getlength("Java Lambda Expression Demo"));
	}


interface StringLengthLambda{
	int getlength(String s);
}
}


