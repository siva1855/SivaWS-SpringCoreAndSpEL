package siva.spring.core.spel.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("itemBean")
public class Item {

	@Value("OracleDB") // inject String directly
	private String name;

	@Value("10") // inject interger directly
	private int qty;
	
	@Value("#{10+2}")
	private int count;
	
	@Value("#{'java'.toUpperCase()}")
	private String techName;
	
	public Item() {
		super();
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + ", count=" + count + ", techName=" + techName + "]";
	}

}