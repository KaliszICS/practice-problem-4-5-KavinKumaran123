public class PracticeProblem {

	public static void main(String args[]) {

	}
}

// Student Class
class Student {
	private String name;
	private int age;
	private String studentNumber; // 🔥 FIXED: must be String

	public Student(String name, int age, String studentNumber) {
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getStudentNumber() { // 🔥 must return String
		return studentNumber;
	}

	// toString
	@Override
	public String toString() {
		return name + ", " + age + " - " + studentNumber;
	}

	// equals (compare ONLY studentNumber)
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Student other = (Student) obj;
		return this.studentNumber.equals(other.studentNumber);
	}
}

// Cow Class
class Cow {
	private String name;
	private int age;
	private double weight;

	public Cow(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	// toString
	@Override
	public String toString() {
		return name + ", " + age + " - " + weight;
	}

	// equals (compare ALL fields)
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Cow other = (Cow) obj;

		return this.age == other.age &&
		       this.weight == other.weight &&
		       this.name.equals(other.name);
	}
}