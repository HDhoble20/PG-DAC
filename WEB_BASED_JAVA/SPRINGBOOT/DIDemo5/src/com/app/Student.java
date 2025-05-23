package com.app;

import org.springframework.beans.factory.annotation.Value;

public class Student {
 private String name;
 @Value ("SAP")
 private String intrestedCourse;
 
 @Value(value= "${student.hobby}")
 private String hobby;
 
 @Value("Rohan")
 public void setName(String name)
 {
	 this.name=name;
 }

public void setIntrestedCourse(String intrestedCourse) {
	this.intrestedCourse = intrestedCourse;
}

public void setHobby(String hobby) {
	this.hobby = hobby;
}

@Override
public String toString() {
	return "Student [name=" + name + ", intrestedCourse=" + intrestedCourse + ", hobby=" + hobby + "]";
}
 
}
