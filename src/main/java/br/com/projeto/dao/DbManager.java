package br.com.projeto.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;

public class DbManager {
	private Connection conn;
	private PreparedStatement statement;
	
	//Criando conexão com o banco
	public void getConnection() throws ClassNotFoundException, SQLException{

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3305/test","root","tobegreat");
			this.conn = conn;

	}
	
	//metodo de execução de queries
	private void executeSql(String sql) throws SQLException{
		
		this.statement.executeUpdate();
		
	}
	
	//metodo de fechamento da conexão
	public void closeConnection() throws SQLException{
		this.conn.close();
	}
	
	//método de busca de clientes
    public ArrayList<String> selectClientes(String query) throws SQLException{
    	
    	this.statement = this.conn.prepareStatement(query);
    	ResultSet result = this.statement.executeQuery();
    	ArrayList<String> array = new ArrayList<String>();
    	
    	while(result.next()){
    		array.add(result.getString("nome"));
    	}
    	
    	return array;
   
	}
}
