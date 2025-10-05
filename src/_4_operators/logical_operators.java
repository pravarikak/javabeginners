//To find a number is divisible by 3 and 7
public class logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Logical Operators - &&,||,!
		//we are going to get boolean result
		//&&- Logical AND
		//||-Logical NOT
		//!-NOT operator
		//&&
		//T&T - T
		//T&F -F
		//F&T-F
		//F&F -F
		
		//||
		//T||T - T
		//T||F -T
		//F||T-T
		//F||F -F
		
		//!
		//T - F
		//F - T
		int n=1+(int)(Math.random()*100);//1-100
		System.out.println("number generated"+ n);
		if(n%3==0&&n%7==0) {
			System.out.println(n+" is divisble by 3 and 7 ");
		}
		else {
			System.out.println(n+" is not divisble by 3 and 7 ");
		}
		//Bitwise operators-they operate on bits
		//&- Bit wise AND
		//| - Bit wise OR
		//~ -Bit wise NOT
		//^ - Bitwise XOR
		//<<-left shift
		//>>-Right shift
		//>>>- unsigned right shift/ right shift with zero fill
		//Numbers are represented in binary
		//10 - 1 0 1 0
		//we should know power of 2
		//10  - 2 power 3|2 power 2|2 power 1 |2 power 0
		//50 - 50 is between 64 and 32
		//32 16 2
		//1 1 0 0 1 0 = 50
		
		
		//Bit wise AND
		// 1 1 - 1
		// 1 0 - 0
		// 0 1 - 0
		// 0 0 - 0
		
		
		//Bit wise OR
		//Atleast one iput is 1 then output is 1
		// 1 1 - 1
		// 1 0 - 1
		// 0 1 - 1
		// 0 0 - 0
		
		//Bit wise XOR
		//will give you one 1 if inputs are different, 0 if inputs are same
		// 1 1 - 0
		// 1 0 - 1
		// 0 1 - 1
		// 0 0 - 0
		
		//Bit wise NOT
		//1 - 0
		//0 - 1
		
		// a = 4 = 0 1 0 0 
		// b = 3 = 0 0 1 1
		//(a&b)  = 0 0 0 0 //0
		//(a|b)  = 0 1 1 1 //7
		//(a^b)  = 0 1 1 1 //7
		//(~a)  = -(a+1) // - 5
		int a = 4;
		int b = 3;
		
		System.out.println(a&b);//0
		System.out.println(a|b);//7
		System.out.println(a^b);//7
		System.out.println(~a);//-5
		System.out.println(a<<1);//8
		System.out.println(a<<2);//16
		
		System.out.println(b>>1);//2
		
		System.out.println(a>>>1);//2
		
		
		//a = 4 
		//<<
		// 0 0 0 0 0 1 0 0 
		//left shift by one bit 
		// 0 0 0 0 1 0 0 0 // a value will become 8 
		//left shift by one bit again
		// 0 0 0 1 0 0 0 0  // a value will become 16
		// left shift will double the number
		// a * 2 power (how many times ur shifting)
		
		
		// a = 32 
		//>>
		// when you right shift the number becomes half
		// a * 2 power (-n)
		
		//>>>
		
		int x = 4, y = 3;

		int result = x << 1 + y >> 1;

		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
