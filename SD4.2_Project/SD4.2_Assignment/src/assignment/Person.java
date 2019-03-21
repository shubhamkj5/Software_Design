package assignment;

class Person{
	private String name;
	private String contact;
	
	public Person(String name,String contact){
		this.setName(name);
		this.setContact(contact);
	}
	

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

