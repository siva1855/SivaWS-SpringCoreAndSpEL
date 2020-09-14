package siva.spring.core.config;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import siva.spring.core.beans.Product;

@Configuration
public class AppConfig {
	@Bean
	public Product productObject() {
		Product product = new Product();
		product.setMobiles(listObject());
		product.setColors(setObject());
		product.setRamAndPrice(mapObject());
		product.setDeviceProperties(propertiesObject());
		return product;
	}

	public List<String> listObject() {
		List<String> list = new ArrayList<String>();
		list.add("RedMi");
		list.add("RealMe");
		list.add("Samsung");
		list.add("OPPO");
		list.add("VIVO");
		return list;
	}

	public Set<String> setObject() {
		Set<String> set = new LinkedHashSet<String>();

		set.add("Red");
		set.add("Black");
		set.add("GoldColour");
		set.add("Blue");

		return set;
	}

	public Map<String, String> mapObject() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("2GB", "6,0000/-");
		map.put("3GB", "9,0000/-");
		map.put("4GB", "10,0000/-");
		map.put("6GB", "15,0000/-");
		map.put("8GB", "25,0000/-");
		return map;
	}

	public Properties propertiesObject() {
		Properties properties = new Properties();
		properties.put("BackCamera", "12Pixels");
		properties.put("FrontCamera", "4Pixels");
		properties.put("Battery", "5000Watts");
		properties.put("InternalMemory", "32GB");
		properties.put("AndriodVersion", "9-Pie");
		return properties;
	}
}
