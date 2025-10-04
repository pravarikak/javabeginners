
public class ASCII {

	public static void main(String[] args) {
		//Upper case alphabets starts from ASCII Value 65 to ASCII Value 90
		//Printing all the Upper case alphabets
		for(int i=65;i<=90;i++) {
			System.out.print((char)i+" ");
		}
      System.out.println();
      //lower case
      for(int i=97;i<=122;i++) {
  		System.out.print((char)i+" ");
  	      }
       System.out.println();
       //numbers
       for(int i=48;i<=57;i++) {
     		System.out.print((char)i+" ");
     	      }
          System.out.println();
          
      ////Printing all the ASCII Set
          for(int i=0;i<=127;i++) {
       		System.out.print(i+"-"+(char)i+"   ");
       	      }
            System.out.println();
      //printing only printable characters
            for(int i=33;i<=127;i++) {
           		System.out.print(i+"-"+(char)i+"   ");
           	      }
                System.out.println();
	}
	
	
	
}

