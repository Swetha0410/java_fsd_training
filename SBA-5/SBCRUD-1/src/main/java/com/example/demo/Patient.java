package com.example.demo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//defining class name as Table name
@Table
public class Patient
{
//Defining book id as primary key
@Id
@Column
private int patientid;
@Column
private String patientname;
@Column
private String disease;
@Column
private int age;
public int getPatientid() 
{
return patientid;
}
public void setPatientid(int patientid) 
{
this.patientid = patientid;
}
public String getPatientname()
{
return patientname;
}
public void setPatientname(String patientname) 
{
this.patientname = patientname;
}
public String getdisease() 
{
return disease;
}
public void setdisease(String disease) 
{
this.disease = disease;
}
public int getAge() 
{
return age;
}
public void setAge(int age) 
{
this.age = age;
}
}

