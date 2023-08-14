package Transaction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TransactionEntity {

	private String userName;
	private String email;
	private int busId;
	private String busName;
	private int noOfSeat;
	private String busName1;
	private int price;
	private int total;
	private int date;
	
	@Id
	@GeneratedValue
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public String getBusName1() {
		return busName1;
	}
	public void setBusName1(String busName1) {
		this.busName1 = busName1;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TransactionEntity [userName=" + userName + ", email=" + email + ", busId=" + busId + ", busName="
				+ busName + ", noOfSeat=" + noOfSeat + ", busName1=" + busName1 + ", price=" + price + ", total="
				+ total + ", date=" + date + "]";
	}
	public TransactionEntity(String userName, String email, int busId, String busName, int noOfSeat, String busName1,
			int price, int total, int date) {
		super();
		this.userName = userName;
		this.email = email;
		this.busId = busId;
		this.busName = busName;
		this.noOfSeat = noOfSeat;
		this.busName1 = busName1;
		this.price = price;
		this.total = total;
		this.date = date;
	}
	
}
