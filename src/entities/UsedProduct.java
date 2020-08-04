package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	// Attributes
	private Date manufactureDate;

	// Builders
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	// Accessor Methods
	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// Methods
	@Override
	public String priceTag() {
		return getName()
				+ " (used) $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";
	}

}
