package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Imagem;

public class ImagemDao implements Dao<Imagem>{

	private Connection connection;
	
	public ImagemDao() {
		this.connection = DbUtil.getConnection();
	}
	
	@Override
	public void insert(Imagem imagem) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("exec spInsert_tbimagem (?, ?)");
            
            // Parameters start with 1
            preparedStatement.setString(1, imagem.getPath());
            preparedStatement.setString(2, imagem.getDescricao());            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void update(Imagem imagem) {
		try {
			//Java 13 - text block -  """   """
            PreparedStatement preparedStatement = connection
                    .prepareStatement("exec spUpdate_tbimage (ID=?, "
                    									+ "PATH=?, " 
                    									+ "DESCRICAO=?)");
            
            // Parameters start with 1
            // preparedStatement previne SQL Injection...
            preparedStatement.setString(1, imagem.getPath());
            preparedStatement.setString(2, imagem.getDescricao());            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void delete(Imagem obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Imagem find(Imagem obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Imagem> findAll(Imagem obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
