package entities;

public class Product {

	// Attributes
	protected String name;
	protected Double price;

	// Builders
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// Accessor Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//Methods
	public String priceTag() {
		return name 
				+ " $ " 
				+ String.format("%.2f", price);
	}

}
