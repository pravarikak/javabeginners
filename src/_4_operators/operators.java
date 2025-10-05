
public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]); //123
		int y = Integer.parseInt(args[1]); //0
		
		int res = x/y;
		System.out.println(res);//Arithmetic exception
		//Since it is exception the program crashes here
		int p =x*y;
		System.out.println(p);//
		
		int r =x%y;
		System.out.println(r);//
	}

}
