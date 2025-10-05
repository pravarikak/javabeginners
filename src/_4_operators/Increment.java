
public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y = x++;
		int a=10;
		int z= ++a;
		
		//1. x++ - the value will get assigned first and later it will get incremented
		//2. ++x - the value will be incremented first and later get assigned
		
		System.out.println(x);//11
		System.out.println(y);//10
		System.out.println(a);//11
		System.out.println(z);//11

		
		int p=10;
		int res = p++ + ++p;
		System.out.println(p);//12
		System.out.println(res);//22
		//p is assigned first and then incremented
		//10(after assigning it will get incremented it becomes 11- ++p will be 12
		//10+12 =22; 
	}

}
