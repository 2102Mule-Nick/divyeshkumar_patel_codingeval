package com.family.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.postgresql.core.ConnectionFactory;

import com.family.exception.PersonNotFound;
import com.family.pojo.Person;
import com.family.util.ConnectionFactoryPostgres;

public class PersonDaoPostgres implements PersonDao {
	
	Logger log = Logger.getRootLogger();
	Connection conn = ConnectionFactoryPostgres.getConnection();
	PreparedStatement stmt;
	
	
	public PersonDaoPostgres() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enterPerson(Person person) {
		
		
		String sql = "insert into Person(firstname, fathersname, mothersname,gender) values (?,?,?,?)";
		log.trace("enterPerson in PersonDaoPostgres - Person added to Family");
		try {
			stmt= conn.prepareStatement(sql);
			stmt.setString(1, person.getFirstName());;
			stmt.setString(2, person.getFathersName());
			stmt.setString(3, person.getMothersName());
			stmt.setString(4, person.getGender());
			stmt.execute();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updatePerson(Person person) {
		String sql = "update Person set fathersname = ? and mothersname =? where firstname=?";
		log.trace("enterPerson in PersonDaoPostgres - Person added to Family");
		try {
			stmt= conn.prepareStatement(sql);
			stmt.setString(1, person.getFathersName());;
			stmt.setString(2, person.getMothersName());
			stmt.setString(3, person.getFirstName());
			stmt.execute();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public Person getPersonbyName(String name) throws PersonNotFound {
		String sql="select firstname from person where firstname =? ";
		Person person = null;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			ResultSet rs= stmt.executeQuery();
			while(rs.next()) {
			person = new Person();
			person.setFirstName("firstname");
			person.setFathersName("fathersname");
			person.setMothersName("mothersname");
			person.setGender("gender");
			}
		}catch(SQLException e) {
			log.error("Couldn't get any information - Something went wrong in PersonDaoPostgres");
			
			e.printStackTrace();
		}
		return person;
	}

}
