
public class Abc {

	public static void main(String[] args) {
		
		String s="siva";
		String p="siva";
		int i=1;
		//charAt
		System.out.println(s.charAt(i));
		//codePointAt
		System.out.println(s.codePointAt(i));
		//codePointBefore(int index)
		System.out.println(s.codePointBefore(i));
		//	codePointCount(int beginIndex, int endIndex)
		System.out.println(s.codePointCount(0, 0));
		//boolean	contains(CharSequence s)
		//boolean	contains(CharSequence s)
		System.out.println(s.contains(p));
		//boolean	contentEquals(CharSequence cs)
		System.out.println(s.contentEquals(p));
		
		

	}

}
