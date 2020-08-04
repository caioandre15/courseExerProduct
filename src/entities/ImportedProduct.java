package entities;

public class ImportedProduct extends Product {

	// Attributes
	private Double customsFee;

	// Builders
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	// Accessor Methods
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	// Methods
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ "(Customs fee: $ " + String.format("%.2f", customsFee) + ")";
	}

}
