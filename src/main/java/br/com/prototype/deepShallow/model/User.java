package br.com.prototype.deepShallow.model;

public class User implements Cloneable {
	public String name;
	public Integer age;
	public Address address;

	public User(String name, Integer age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public User clone() throws CloneNotSupportedException {
		User cloneUser = (User) super.clone();
		// addres in not a primitive, needs to be cloned for a deep copy
		cloneUser.address = (Address) cloneUser.address.clone();
		return cloneUser;
	}
}
