import java.util.Scanner;

public class caesarCypher {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Text to be Decoded :");
		String message = scanner.nextLine();
		char[] charArray = message.toCharArray();

		for(int j=1; j<26; j++){

			for(int i = 0; i < charArray.length; i++){
			
				if(Character.isLetter(charArray[i])){

					if(Character.isUpperCase(charArray[i]) && charArray[i] <= 89){
						charArray[i]++;
					}
					else if(Character.isUpperCase(charArray[i]) && charArray[i] == 90){
						charArray[i] = 'A';
					}
					else if(Character.isLowerCase(charArray[i]) && charArray[i] <=121){
						charArray[i]++;
					}
					else if(Character.isLowerCase(charArray[i]) && charArray[i] == 122){
						charArray[i] = 'a';
					}

				}
				
			}
			String decodedMessage = new String(charArray);
			System.out.println(decodedMessage);
			System.out.println();
		
		}

	}

}