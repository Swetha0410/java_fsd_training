//3. Create a labeled break and write a simple logic and execute the program.
package SBA1;

public class SBA1c {
	public static void main(String[] args) {
		int num =0;
		start:
		{
			for(int i=0; i<=10; i++) {
				for(int j=0; j<=10; j++) {
					if(i==5)
						break start;
				}
				num++;
			}
		}
		System.out.println(num);
	}

}
