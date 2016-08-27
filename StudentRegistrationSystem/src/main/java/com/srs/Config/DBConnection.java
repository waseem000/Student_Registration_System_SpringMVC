package com.srs.Config;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

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
	
	public String execute_statment(String sqlQuery) //update, insert, delete 
	{
		String value = null;
		Integer rowsAffected;
		try{
			rowsAffected=jdbcTemplate.update(sqlQuery);
			value= rowsAffected.toString();
			return value;
		}
		catch (DuplicateKeyException dup)
		{
			throw new DuplicateKeyException(sqlQuery, dup);
		}
		catch (DataAccessException e)
		{
			 value=e.getMessage();
				return value;
			// throw new RuntimeException(e);
		}
	}

}
