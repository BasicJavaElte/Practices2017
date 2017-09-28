
public class Person {
	private String name;
	private int age;
	private char gender;
	private boolean pregnant;

  // My constructor with all arguments
	public Person(String name, int age, char gender, boolean pregnant) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.pregnant = pregnant;
	}

  // My equals method
	public boolean equals(Person other) {
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pregnant != other.pregnant)
			return false;
		return true;
	}

  // Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isPregnant() {
		return pregnant;
	}

	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}

}
