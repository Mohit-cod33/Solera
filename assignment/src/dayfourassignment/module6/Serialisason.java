package dayfourassignment.module6;

import java.io.Serializable;

public class Serialisason implements Serializable {
	 //private static final long serialVersionUID = -5551642649093889857L;
	 private static final long serialVersionUID = -55589857L;
	 protected String name = null; 
	 protected Integer age = null;/** * Non-persitable fields */ 
	 protected transient String location = null;
	 public Serialisason(){
		 
	 }
	 public Serialisason(String name, Integer age, String location) {
		 this.name = name; 
		 this.age = age; 
		 this.location = location;
		 }
	 @Override 
	 public String toString() { 
		 return "Name: " + name + " Age: " + age + " Location: " + location; }
	 }
