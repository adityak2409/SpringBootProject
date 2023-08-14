package Bus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BusEntity {

	private String busName;
	private String destination;
	private String busType;
	private int departureTime;
	private int arrivalTime;
	private int totalSeat;
	private int price;
	
	@Id
	@GeneratedValue
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BusEntity [busName=" + busName + ", destination=" + destination + ", busType=" + busType
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", totalSeat=" + totalSeat
				+ ", price=" + price + "]";
	}
	public BusEntity(String busName, String destination, String busType, int departureTime, int arrivalTime,
			int totalSeat, int price) {
		super();
		this.busName = busName;
		this.destination = destination;
		this.busType = busType;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.totalSeat = totalSeat;
		this.price = price;
	}
	
	
}
