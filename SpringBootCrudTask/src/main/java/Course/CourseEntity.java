package Course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CourseEntity {

	private int courseID;
	private String title;
	private int startDate;
	private int endDate;
	
	@Id
	@GeneratedValue
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public int getEndDate() {
		return endDate;
	}
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "CourseEntity [courseID=" + courseID + ", title=" + title + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	public CourseEntity(int courseID, String title, int startDate, int endDate) {
		super();
		this.courseID = courseID;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
}
