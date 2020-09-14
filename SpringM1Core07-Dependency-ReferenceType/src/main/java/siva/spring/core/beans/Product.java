package siva.spring.core.beans;

public class Product {

	private String productName;
	private Model model;

	public Product() {
		super();
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", model=" + model + "]";
	}

}
