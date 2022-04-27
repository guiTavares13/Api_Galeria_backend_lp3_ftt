package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Autor;

public class AutorDao implements Dao<Autor>{

	private Connection connection;
	
	public AutorDao() {
		this.connection = DbUtil.getConnection();
	}
	
	@Override
	public void insert(Autor autor) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("exec spInsert_tbautor (?, ?)");
            
            // Parameters start with 1
            preparedStatement.setString(1, autor.getName());
            preparedStatement.setString(2, autor.getDescricao());            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void update(Autor autor) {
		try {
			//Java 13 - text block -  """   """
            PreparedStatement preparedStatement = connection
                    .prepareStatement("exec spUpdate_tbautor (ID=?, "
                    									+ "NAME=?, " 
                    									+ "DESCRICAO=?)");
            
            // Parameters start with 1
            // preparedStatement previne SQL Injection...
            preparedStatement.setString(1, autor.getName());
            preparedStatement.setString(2, autor.getDescricao());            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void delete(Autor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Autor find(Autor obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Autor> findAll(Autor obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
