package service;

import java.math.BigDecimal;

public class Service {
	private int id;
	private String description;
	private BigDecimal price;
	
	public Service(int id, String description, BigDecimal price) {
		this.id = id;
		this.setDescription(description);
		this.setPrice(price);
	}
	
	public String getDescripstion() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public BigDecimal getPrice() {
		return this.price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
