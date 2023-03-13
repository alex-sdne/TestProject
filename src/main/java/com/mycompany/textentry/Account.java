/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textentry;

/**
 *
 * @author Alex
 */
public class Account {
	
	private String fname;
	private String lname;
	private String id;
	
	public Account(String fname, String lname, String id) {
		this.fname = fname;
		this.lname = lname;
		this.id = id;
	}
	
	public Account() {}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "This is " + this.fname + " " + this.lname 
				+ ", student ID: " + this.id;
	}

}
