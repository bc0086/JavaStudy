/*
  	구구단인데 짝수는 5단 이하, 홀수는 6단 이상만 출력되게 하시오.
 */

package Etc;

public class ilsunTest {

	public static void main(String[] args) {

		for (int dan=2 ; dan<=9; dan++) {
			
			for (int su=1; su<= 9; su++) {
				
				if(dan*su % 2 == 0 && dan >=6) {    
					continue;
				}
				if(dan*su % 2 == 1 && dan <= 5) { 
					continue;
				}
				
				System.out.print(dan +"*"+ su+ "=" + dan*su + " " );
			}
			System.out.println();    
		}
		
	}

}
