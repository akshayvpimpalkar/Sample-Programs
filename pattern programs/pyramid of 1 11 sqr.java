
public class Main {

	public static void main(String[] args) {
//		String s = "";
		int result= 0;
		for(int i = 1; i<= 4; i++){
//			System.out.println(s += "*");
			for(int j = i; j <= 3 ; j++){
				System.out.print(" ");
			}
			result = result*10 + 1;
			System.out.println(result * result);
		}
	}

}

/*
o/p:

    1
   121
  12321
 1234321
*/
