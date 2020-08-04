import java.util.ArrayList;

public class MobilePhone {
	private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

	private boolean is_empty(Contacts contact, boolean name) {
		if (name) {
			return (contact.getName().equals(null) || contact.getName().equals(""));
		} else {
			return (contact.getPhoneNumber().equals(null) || contact.getPhoneNumber().equals(""));
		}
	}

	public void displayOptions() {
		System.out.println("0 to quit");
		System.out.println("1 to see list of contacts");
		System.out.println("2 - Add a new contact");
		System.out.println("3 - update existing contact");
		System.out.println("4 - remove contact");
		System.out.println("5 - find a contact");
	}

	public void displayContactsList() {
		System.out.println("Contacts ");
		System.out.println("--------------------");
		for (int i = 0; i < this.contacts.size(); i++) {
			System.out.println((i + 1) + ". " + this.contacts.get(i).getName());
			System.out.println("#: " + this.contacts.get(i).getPhoneNumber());
		}
	}

	public boolean addContact(Contacts newContact) {
		if (this.contacts.contains(newContact) || this.findContact(newContact.getName())) {
			System.out.println("Contact has already been found");
			return false;
		}
		if (!this.is_empty(newContact, true)) {
			System.out.println("New contact called " + newContact.getName() + " has been added!");
			this.contacts.add(newContact);
			return true;
		}
		return false;
	}

	public boolean updateContact(String oldName, Contacts newContact) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).getName().equals(newContact.getName())) {
				System.out.println("Already store contact with this name");
				return false;
			}
		}
		if (this.findContact(oldName)) {
			int index = this._findContact(oldName);
			Contacts oldContact = this.contacts.get(index);

			if (!(newContact.getName().equals(null) || newContact.getName().equals(""))) {
				oldContact.setName(newContact.getName());
				System.out.println(
						"Updated name of contact from " + oldContact.getName() + " to " + newContact.getName());
			} else {
				System.out.println("No name received to update");
			}
			if (!(newContact.getPhoneNumber().equals(null) || newContact.getPhoneNumber().equals(""))) {
				oldContact.setPhoneNumber(newContact.getPhoneNumber());
				System.out.println("Updated name of contact from " + oldContact.getPhoneNumber() + " to "
						+ newContact.getPhoneNumber());

			} else {
				System.out.println("No phone number received to update");
			}

		}
		return true;

	}

	public void deleteContact(String name) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).getName().equals(name)) {
				System.out.println("Contact " + this.contacts.get(i).getName() + " has been deleted");
				this.contacts.remove(i);
			}
		}
	}

	private int _findContact(String name) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public boolean findContact(String findContact) {
		for (int i = 0; i < this.contacts.size(); i++) {
			if (this.contacts.get(i).getName().equals(findContact)) {
				return true;
			}
		}
		return false;
	}

}
