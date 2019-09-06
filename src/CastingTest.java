
public class CastingTest {

	public static void main(String[] args) {
		// implicit(암시적) : 작은데서 큰데로 갈 때
		int i = 10;
		long l = i;
		System.out.println(i + " : " + l);
		
		// explicit(명시적) : 큰데서 작은데로 갈 때
		int j = (int) l;
		System.out.println(j + " : " + l);
	}

}
