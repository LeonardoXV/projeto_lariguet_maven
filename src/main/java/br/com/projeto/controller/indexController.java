package br.com.projeto.controller;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sun.mail.iap.Response;

import br.com.projeto.dao.DAO;
import br.com.projeto.model.Cliente;
import br.com.projeto.model.Livro;
@Controller
@RequestMapping("index")
public class indexController {
	

	@Autowired
	private DAO<Livro> dao;
	
	@RequestMapping("/home")
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
	@RequestMapping("/save")
	public void createBook(@RequestParam("titulo") String titulo,@RequestParam("numero")String qtd_paginas,@RequestParam("categoria") String categoria){
		Livro livro = new Livro(titulo,Integer.parseInt(qtd_paginas),categoria);
		dao.save(livro);
		
	}
	
	@RequestMapping("/list")
	public ModelAndView callList(){
		return new ModelAndView("lista");
	}
}
