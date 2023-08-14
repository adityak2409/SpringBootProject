package Product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class ProductEntity {
   
	 private int productId;
	 private String name;
	 private int price;
	 
	 @Id
		@GeneratedValue
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}
	public ProductEntity(int productId, String name, int price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}
	 
	
	
	
	
}