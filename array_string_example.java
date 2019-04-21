
public class array_string_example {

	public static void main(String[] args) {
		String[] words= new String[3];
		words[0]=" hello";
		words[1]=" every";
		words[2]=" One";
		
		System.out.println(words[2]);
		
		String[] fruits= {"Apple","Mango","Grapes"};
		
		for ( String fruit: fruits)
			System.out.println(fruit);

	}

}
