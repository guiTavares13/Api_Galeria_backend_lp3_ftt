package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Tag;

public class TagDao implements Dao<Tag>{

	private Connection connection;
	
	public TagDao() {
		this.connection = DbUtil.getConnection();
	}
	
	@Override
	public void insert(Tag tag) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("exec spInsert_tbtag (?, ?)");
            
            // Parameters start with 1
            preparedStatement.setString(1, tag.getTag());        
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void update(Tag tag) {
		try {
			//Java 13 - text block -  """   """
            PreparedStatement preparedStatement = connection
                    .prepareStatement("exec spUpdate_tbtag (ID=?, "
                    									+ "TAG=?)"); 
            
            // Parameters start with 1
            // preparedStatement previne SQL Injection...
            preparedStatement.setString(1, tag.getName());           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void delete(Tag obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tag find(Tag obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Tag> findAll(Tag obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
