package temp;

public class SampleConst {
	
	public  SampleConst(String value,int number) {
		
		System.out.println("calling constructor");
		System.out.println(value);
		System.out.println(number);
	}
	
	

	public static void main(String[] args) {
		SampleConst sample= new SampleConst("test",234);

	}

}
