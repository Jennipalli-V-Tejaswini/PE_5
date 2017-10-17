interface Hand{
	public void facepalm();
	
}
public class PE5_4 {
 public Hand method()
 {
	 class Palm implements Hand{
		 public void facepalm() {
			 System.out.print("You are in inner class");
		 }
		 
}
	 Hand palm=new Palm();
	 palm.facepalm();
	 return palm;
 }


public static void main(String[] args) {
	PE5_4 pe5_4=new PE5_4();
	pe5_4.method();
}
}
