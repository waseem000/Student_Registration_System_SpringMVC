package com.srs.Config;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class DBConnection {

	private static JdbcTemplate jdbcTemplate;

	public static JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		//this.jdbcTemplate = jdbcTemplate;
		DBConnection.jdbcTemplate = jdbcTemplate;
	}
	public DBConnection() {
		// TODO Auto-generated constructor stub
	}

	public DBConnection(DataSource dataSource)
	{
		jdbcTemplate= new JdbcTemplate(dataSource);
	}

	public Map<String, Object>/*List*/ execute_query(String sqlQuery) //select  row/s
	{
		/*List*/Map<String, Object>result;
		try
		{
			result= jdbcTemplate.queryForMap(sqlQuery);/*jdbcTemplate.queryForList(sqlQuery);*/
		}
		catch (InvalidResultSetAccessException e) 
		{
		    throw new RuntimeException(e);
		} 
		catch (DataAccessException e)
		{
		    throw new RuntimeException(e);
		}
	
		return result;
	}
	
	public Integer execute_statment(String sqlQuery) //update, insert, delete 
	{
		int rowsAffected;
		try{
			rowsAffected=jdbcTemplate.update(sqlQuery);
		}
		catch (DataAccessException e)
		{
			 throw new RuntimeException(e);
		}
		
		return rowsAffected;
	}

}
