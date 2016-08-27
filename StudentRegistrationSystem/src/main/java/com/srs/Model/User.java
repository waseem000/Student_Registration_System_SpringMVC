package com.srs.Model;

import java.util.Map;

import com.srs.Config.DBConnection;

public class User {

	private int regId;
	private int roleId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String email;
	private String gender;

	private DBConnection dbConnect = new DBConnection();
	
	public String createUser ()//(int roleId,int regId,String firstName, String lastName,String userName, String password,String email )
	{
		String sql;
		String sqlResult;
		int affectedRows=0;
		sql= "insert into user(role_id,reg_id,first_name,last_name,email,user_name,password,gender) values('"+roleId+"','"+ regId+"','"+ firstName+"','"+lastName+"','"+email+"','"+userName+"','"+password+"','"+gender+"');";
		System.out.println(sql);
		
		sqlResult=dbConnect.execute_statment(sql);
		
		if(sqlResult.equals("0") ||sqlResult.equals("1"))
		{
			affectedRows=Integer.getInteger(sqlResult);
			if(affectedRows>0)
			{
				System.out.println("user added");
				return "true";
			}
			else
			{
				return "false";
			}
		}
		else
		{
			System.out.println(sqlResult);
			return sqlResult;
		}
		
	}
	
	public boolean updateUser(int regId)
	{
/*		String sql;
		int affectedRows;
		 sql="UPDATE  user SET role_id ='"+roleId+"'first_name = '"+firstName+"', last_name = '"+ lastName+"' email='"+email+"',user_name = '"+userName+"', password = '" +password+"',gender = '"+gender+" WHERE  reg_id = '"+regId+"';";
		System.out.println(sql);
		
		affectedRows=dbConnect.execute_statment(sql);
		if(affectedRows>0)
		{
			System.out.print(affectedRows);
			return true;
		}
		else
		{
			System.out.print(affectedRows);
			return false;
		}*/
		return false;
	}

	public boolean deleteUser(int regId)
	{
		/*String sql;
		int affectedRows;
		
		sql="delete from user where reg_id = '"+regId+"';";
		System.out.println(sql);
		
		affectedRows=dbConnect.execute_statment(sql);
		if(affectedRows>0)
		{
			System.out.print(affectedRows);
			return true;
		}
		else
		{
			System.out.print(affectedRows);
			return false;
		}*/
		return false;
	}
	
	public boolean getUserData(int regId) 
	{
	
		String sql = "select role_id, first_name,last_name, email,user_name,password,gender from user WHERE reg_id="+regId+";";
		System.out.println(sql);
		Map<String, Object> results = dbConnect.execute_query(sql); 

		if(results.isEmpty())
		{
			return false;
		}
		else
		{
			setRegId(regId);
			setUserData(results);
			return true;
		}
	}
	
	private void setUserData(Map<String, Object> results)
	{
		for (Map.Entry <String,Object> m: results.entrySet())
		{
			System.out.println ( m.getKey());
			switch (m.getKey()) {
			case "role_id":
				setRoleId(Integer.parseInt(m.getValue().toString()));
				System.out.println( m.getValue());
				break;
			case "first_name":
				setFirstName(m.getValue().toString());
				System.out.println( m.getValue());
				break;
			case "last_name":
				setLastName(m.getValue().toString());
				System.out.println( m.getValue());
				break;
			case "email":
				setEmail(m.getValue().toString());
				System.out.println( m.getValue());
				break;
			case "user_name":
				setUserName(m.getValue().toString());
				break;
			case "password":
				setPassword(m.getValue().toString());
				break;
			case "gender":
				setGender(m.getValue().toString());
				break;
			default:
				System.out.println("Erorr in retriving Data"+ m.getValue());
				break;
			}
		} 
	}
	
	
	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public DBConnection getDbConnect() {
		return dbConnect;
	}

	public void setDbConnect(DBConnection dbConnect) {
		this.dbConnect = dbConnect;
	}
}
