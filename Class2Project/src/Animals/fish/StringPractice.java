package Animals.fish;

public class StringPractice {
	public static void main(String [] args) {
		String str =  "My name is Fadila Alhassan";
		System.out.println(str.toUpperCase());
		
		String str2 = str. substring(11,25);
		System.out.println(str2);
		
		int pos = str.indexOf("Fadila Alhassan");
		System.out.println(pos);
	}
	

}
