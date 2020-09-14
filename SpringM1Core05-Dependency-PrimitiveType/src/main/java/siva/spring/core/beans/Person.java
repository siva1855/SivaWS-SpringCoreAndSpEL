package siva.spring.core.beans;

public class Person {

	private byte memory;
	private short width;
	private int age;
	private long mobileNumber;
	private double salary;
	private float height;
	private boolean health;
	private char gender;

	private String name;

	public Person() {
		super();
	}

	public byte getMemory() {
		return memory;
	}

	public void setMemory(byte memory) {
		this.memory = memory;
	}

	public short getWidth() {
		return width;
	}

	public void setWidth(short width) {
		this.width = width;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Persion [memory=" + memory + ", width=" + width + ", age=" + age + ", mobileNumber=" + mobileNumber
				+ ", salary=" + salary + ", height=" + height + ", health=" + health + ", gender=" + gender + ", name="
				+ name + "]";
	}

}
