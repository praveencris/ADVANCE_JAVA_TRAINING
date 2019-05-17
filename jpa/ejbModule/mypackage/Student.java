package mypackage;
import javax.persistence.*;
@Entity
@Table(name="Student")
public class Student {

	private int id;
	@Id
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="sname", length=30 )
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Column(name="sroll")
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
		@Column(name="scourse",length=40)	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	private String sname;
	private int roll;
	private String course;

}
