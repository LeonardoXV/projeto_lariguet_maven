package br.com.projeto.controller;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.projeto.dao.DbManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet
public class Controle extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private DbManager db = new DbManager();
	
	public ArrayList<String> findClientes (){
		ArrayList<String> array = new ArrayList<String>();
		try{
			this.db.getConnection();
			array = this.db.selectClientes("select nome from clientes");
			this.db.closeConnection();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return array;
	}
	
}
