
package org.company.sbcrudrestful.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User1")
public class User{
	
	public User() {
		
	}
	
	@Id
	@GeneratedValue
	@Column(name = "user_Id", nullable = false)
	private Long user_Id;

	@Column(name = "first_Name", length = 128, nullable = false)
	private String first_Name;

	@Column(name = "last_Name", length = 128, nullable = false)
	private String last_Name;

	@Column(name = "age", nullable = false)
	private int age;

	@Column(name = "gender", length = 128, nullable = false)
	private String gender;

	public Long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public User(Long user_Id, String first_Name, String last_Name, int age, String gender) {
		super();
		this.user_Id = user_Id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.age = age;
		this.gender = gender;
	}

}
