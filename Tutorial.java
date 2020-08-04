import java.util.Scanner;

public class Tutorial {
	public static void main(String[] args) {
		MobilePhone phone = new MobilePhone();
		Scanner scanner = new Scanner(System.in);
		phone.displayOptions();

		boolean quit = false;

		while (!quit) {
			System.out.println("Enter action ");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 0:
				quit = true;
				break;
			case 1:
				phone.displayContactsList();
				break;
			case 2:
				System.out.println("Enter the name of the contact ");
				String name = scanner.nextLine();
				System.out.println("Enter the number of the contact");
				String number = scanner.nextLine();
				phone.addContact(new Contacts(name, number));
				break;
			case 3:
				System.out.println("Enter the name of the old contact you wish to update");
				String oldname = scanner.nextLine();
				System.out.println("Enter the new name of the contact you wish to update");
				String new_name = scanner.nextLine();
				System.out.println("Enter the new number of the contatc you wish to update");
				String new_number = scanner.nextLine();
				phone.updateContact(oldname, new Contacts(new_name, new_number));
				break;
			case 4:
				System.out.println("Enter name of contact to delete");
				String deleteName = scanner.nextLine();
				phone.deleteContact(deleteName);
				break;
			case 5:
				System.out.println("Enter name of contact to find");
				String findName = scanner.nextLine();
				// System.out.println("Enter number of contact to find");
//				/String findNumber = scanner.nextLine();
				if (phone.findContact(findName)) {
					System.out.println("Contact found");
				} else {
					System.out.println("Contact not found");
				}
				break;
			default:
				System.out.println("Command not found!");
			}
		}
	}
}