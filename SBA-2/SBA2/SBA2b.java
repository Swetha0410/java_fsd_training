//2. Write programs to depict the usage of contains(),length(), replace(), concat(), equals().
package SBA2;

public class SBA2b {
	public static void main(String[] args) {
		String s ="This is an String statement";
		String s1 = "Swetha";
		String s2 = new String("Swetha");
		System.out.println(s.length());
		System.out.println(s.contains(s2));
		System.out.println(s.replace('S', 's'));
		System.out.println(s.concat(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
	}

}
