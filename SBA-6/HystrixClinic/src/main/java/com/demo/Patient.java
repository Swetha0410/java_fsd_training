package com.demo;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Patient {
	@Id
	private Long id;
	private String name;
	private Integer age;
	
	public Patient() {
	  }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Patient)) {
			return false;
		}
		Patient other = (Patient) obj;
		return Objects.equals(age, other.age) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
