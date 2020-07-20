import java.util.*;
public class Tutorial {
	
	public static void main(String[] args) {	
		Person person = new Person();
		person.setFirstName("Jeffrey");
		person.setLastName("Kola");
		System.out.println(person.getFullName());
		for(int i=13;i < 19;i++) {
			person.setAge(i);
			System.out.println(person.isTeen());
		}
	}
	
	

	

	
	

}