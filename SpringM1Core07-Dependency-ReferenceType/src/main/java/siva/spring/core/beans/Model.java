package siva.spring.core.beans;

public class Model {

	private double modelNumber;

	public Model() {
		super();
	}

	public void setModelNumber(double modelNumber) {
		this.modelNumber = modelNumber;
	}

	public double getModelNumber() {
		return modelNumber;
	}

	@Override
	public String toString() {
		return "Model [modelNumber=" + modelNumber + "]";
	}

	

}
