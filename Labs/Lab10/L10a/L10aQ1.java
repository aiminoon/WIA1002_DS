package Lab10a;

public class L10aQ1 {
	public static void main(String[] args) {
		System.out.println(substitute("flabbergasted"));
		System.out.println(substitute("Astronaut"));
	}
	
	public static String substitute(String str) {
		int occ = str.indexOf('a');
		
		if(occ == -1) 
			return str;
		
		return str.substring(0, occ) + 'i' + substitute(str.substring(occ + 1));
	}
	
	public static String substituteAI(String input) {
	    if (input.length() == 0) {
	        return input;
	    }
	    char first = input.charAt(0);
	    
	    if (first == 'a') {
	        first = 'i';
	    }
	    return first + substituteAI(input.substring(1));
	}
}
