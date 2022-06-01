package GroupProject;

public class Duplicate {
	public static void main(String[] args) {
		/*
		 * Write a program to print out duplicate elements from an Array of Strings?
		 */
		
		String[] names={"Jennifer", "Ashley", "James", "Jennifer", "Mark"};
		
		for(int i=0; i<names.length; i++) {
			if(names[0]==names[i]) {
				System.out.println(names[i]);
			}
		}
			
			}
		
		
	}


