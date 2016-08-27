package com.srs.Model;

import java.util.Map;

import com.srs.Config.DBConnection;

public class Student {

	private int regId;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String selectedMajor;
	private int totalCredits;
	private int finishedCredits;
	private double gpa;
	private String dateOfJoin;
	private String status;
	
	//private DBConnection database = new DBConnection();
	
	private Map<String, Object> results;
	
	private Majors major = new Majors();
	private StudentRecord record= new StudentRecord();
	
	
	public boolean addStudnet(int regId,String firstName, String lastName,String userName, String password, String gender, String email, String major, int totalCredits, int finishedCredits, String dateOJoin, String status )
	{
		
		
		
		return true;
	}
}
