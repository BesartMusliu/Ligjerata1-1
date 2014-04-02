public class Projekti {
	public static void main(String[] args) {
		
		String str = "123456";
		
		for (int i = 0; i < str.length(); ++i) {
			if (i == 0) {
				System.out.println(str.charAt(i));
			} else if (i == 1) {
				System.out.println("Hajdar Dushi");
			} else {
				System.out.println("Hanife Shtiklla");
			}
		}
		
		
		int j = 0;
		
		do {
			// egzekutohet e para
		} while (j < str.length());
		
		while (j < str.length()) {
			System.out.println(str.charAt(j));
			++j;
		}
		
	}
}