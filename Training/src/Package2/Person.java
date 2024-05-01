package Package2;

import java.util.Objects;

public class Person {

	private int rollno;
	private String name;
	private String email;
	private int phone;
	private String country;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public int hashCode() {
		return Objects.hash(country, email, name, phone, rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(country, other.country) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && phone == other.phone && rollno == other.rollno;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", country=" + country + "]";
	}
	
}
