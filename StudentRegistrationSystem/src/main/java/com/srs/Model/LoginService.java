package com.srs.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.srs.Config.DBConnection;

public class LoginService {

	private int reg_id;
	private int role_id;
	private String user_name;
	private String password;
	private String first_name;
	private String last_name;

	public Map<String, Object> results;

	private DBConnection dbConnect = new DBConnection();

	public boolean userLoginValedation (String user_name, String password)
	{
		String sql = "select role_id, reg_id, first_name,last_name from user WHERE user_name='"+user_name+"' AND password= '"+password+"';";

		results= dbConnect.execute_query(sql); 

		if(results.isEmpty())
		{
			return false;
		}
		else
		{
			setUserData();
			return true;
		}
	}
	private void setUserData()
	{
		for (Map.Entry <String,Object> m: results.entrySet())
		{
			System.out.println ( m.getKey());
			switch (m.getKey()) {
			case "role_id":
				setRole_id(Integer.parseInt(m.getValue().toString()));
				System.out.println( m.getValue());
				break;
			case "reg_id":
				setReg_id(Integer.parseInt(m.getValue().toString()));
				System.out.println( m.getValue());
				break;
			case "first_name":
				setFirst_name(m.getValue().toString());
				System.out.println( m.getValue());
				break;
			case "last_name":
				setLast_name(m.getValue().toString());
				System.out.println( m.getValue());
				break;
			default:
				System.out.println("Erorr in retriving Data"+ m.getValue());
				break;
			}
		} 
	}
	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Map<String, Object> getResults() {
		return results;
	}
	public void setResults(Map<String, Object> results) {
		this.results = results;
	}
	public DBConnection getDbConnect() {
		return dbConnect;
	}

	public void setDbConnect(DBConnection dbConnect) {
		this.dbConnect = dbConnect;
	}
}
