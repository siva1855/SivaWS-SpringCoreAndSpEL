package siva.spring.core.beans;

public class Product {

	private ModelInterface modelInterface;

	public Product() {
		super();
	}

	public ModelInterface getModelInterface() {
		return modelInterface;
	}

	public void setModelInterface(ModelInterface modelInterface) {
		this.modelInterface = modelInterface;
	}

	@Override
	public String toString() {
		return "Product [modelInterface=" + modelInterface + "]";
	}

}
