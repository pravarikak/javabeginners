
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//result = exp1?exp2:exp3;
		//if exp1 is true then result will be exp2
		//if exp2 is true then result will be exp3
		int a=10;
		int b=20;
		int result = a>b?a:b;
		System.out.println(result);
		
		int x = 1 + (int)(Math.random()*100);
		int y = 1 + (int)(Math.random()*100);
		int z = 1 + (int)(Math.random()*100);
		System.out.println(x+" "+y+" "+z);
		
		int biggest = (x>y&&x>z)?x:(y>z?y:z);
		System.out.println(biggest);

	}

}
