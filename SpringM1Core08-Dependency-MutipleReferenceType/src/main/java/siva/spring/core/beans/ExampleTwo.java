package siva.spring.core.beans;

public class ExampleTwo {

	private ExampleThree exampleThree;

	public ExampleTwo() {
		super();
	}

	public ExampleThree getExampleThree() {
		return exampleThree;
	}

	public void setExampleThree(ExampleThree exampleThree) {
		this.exampleThree = exampleThree;
	}

	@Override
	public String toString() {
		return "ExampleTwo [exampleThree=" + exampleThree + "]";
	}

}
