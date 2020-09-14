package siva.spring.core.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Product {

	private List<String> mobiles;
	private Set<String> colors;
	private Map<String, String> ramAndPrice;
	private Properties deviceProperties;

	public Product() {
		super();
	}

	public List<String> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<String> mobiles) {
		this.mobiles = mobiles;
	}

	public Set<String> getColors() {
		return colors;
	}

	public void setColors(Set<String> colors) {
		this.colors = colors;
	}

	public Map<String, String> getRamAndPrice() {
		return ramAndPrice;
	}

	public void setRamAndPrice(Map<String, String> ramAndPrice) {
		this.ramAndPrice = ramAndPrice;
	}

	public Properties getDeviceProperties() {
		return deviceProperties;
	}

	public void setDeviceProperties(Properties deviceProperties) {
		this.deviceProperties = deviceProperties;
	}

	@Override
	public String toString() {
		return "Product [mobiles=" + mobiles + ", colors=" + colors + ", ramAndPrice=" + ramAndPrice
				+ ", deviceProperties=" + deviceProperties + "]";
	}

}
