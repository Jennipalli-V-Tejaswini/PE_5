
public class PE5_2 {
	
	public class Inner{
	}
	
	
	
	public Inner method(String s) {
		System.out.println(s);
		Inner inner=new Inner();
		return inner;
		
	}
	
	
	public static void main(String[] args) {
		PE5_2 pe5_2=new PE5_2();
		Inner inner2=pe5_2.method("You are in inner class");
		}
	}



