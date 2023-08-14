package Product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProjectEntity {
  
	private int projectId;
	private String projectName;
	private int dateOfStart;
	private int teamSize;
	
	@Id
	@GeneratedValue
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getDateOfStart() {
		return dateOfStart;
	}
	public void setDateOfStart(int dateOfStart) {
		this.dateOfStart = dateOfStart;
	}
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	@Override
	public String toString() {
		return "ProjectEntity [projectId=" + projectId + ", projectName=" + projectName + ", dateOfStart=" + dateOfStart
				+ ", teamSize=" + teamSize + "]";
	}
	public ProjectEntity(int projectId, String projectName, int dateOfStart, int teamSize) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.dateOfStart = dateOfStart;
		this.teamSize = teamSize;
	}
	
}
