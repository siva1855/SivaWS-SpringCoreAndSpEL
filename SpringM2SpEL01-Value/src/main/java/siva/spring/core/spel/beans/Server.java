package siva.spring.core.spel.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myServer")
public class Server {

	@Value("#{itemBean}")
	private Item item;

	@Value("#{itemBean.name}")
	private String itemName;

	public Server() {
		super();
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Server [item=" + item + ", itemName=" + itemName + "]";
	}

}