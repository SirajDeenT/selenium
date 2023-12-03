package java;


abstract class Bike{
	abstract void run();
}
 class Honda extends Bike{

	@Override
	 void run() {
		System.out.println("running");
		
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
public class AbstractDemo {
	public static void main(String[]args){
	
	Bike ob=new Honda();
	ob.run();
	

}
}
