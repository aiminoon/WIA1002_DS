package Lab10a;

public class L10aQ3 {
	public static void main(String[] args) {
		System.out.println(exponent(10,3));
	}
	public static long exponent(int x, int m) {
		if (m == 0)
			return 1;
		if (m == 1)
			return x;
		
		return x * exponent(x, m - 1);
	}
}
