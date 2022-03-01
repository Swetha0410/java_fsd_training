//4. Do the addition of around 10 even numbers, but use the continue statement in this logic.
package SBA1;

public class SBA1d {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=20; i++) {
			if((i%2)!=0)
				continue;
			System.out.println(i);
			sum = sum+i;
		}
		System.out.println("The sum of first 10 even numbers is: "+sum);
	}

}
