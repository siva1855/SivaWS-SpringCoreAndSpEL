package siva.spring.core.beans;

public class ExampleOne {

	private ExampleTwo exampleTwo;

	public ExampleOne() {
		super();
	}

	public ExampleTwo getExampleTwo() {
		return exampleTwo;
	}

	public void setExampleTwo(ExampleTwo exampleTwo) {
		this.exampleTwo = exampleTwo;
	}

	@Override
	public String toString() {
		return "ExampleOne [exampleTwo=" + exampleTwo + "]";
	}

}
