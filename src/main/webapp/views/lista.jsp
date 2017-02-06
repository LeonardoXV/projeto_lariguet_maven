<%@page import="br.com.projeto.controller.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Controle c = new Controle();
	ArrayList<String> clientes = c.findClientes();
	
%>
<html lang="pt-br">
  <head>
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="<c:url value = "/assets/libs/materialize/css/materialize.min.css"/>"  media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="<c:url value = "/assets/css/style.css"/>">
    <script type="text/javascript" src="<c:url value = "/assets/libs/jquery/jquery-2.1.1.min.js"/>"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  </head>
   <body>
 <div class="row">
      <div class="col s12 m8 l4 offset-m2 offset-l4 form-section ">
        <div class="card z-depth-4">
          <div class="card-content">
            <span class="card-title">Lista de Clientes</span>

            <div class="row">
            <fieldset class="col s12">
            	<legend>Clientes:</legend>
            	    <%
            			for(String nome : clientes){
            		%>
				    <ul class="collection">
				   	 	<li class="collection-item avatar">
						      <img src="http://i0.kym-cdn.com/entries/icons/original/000/015/845/tumblr_n7dbmvAx6U1sbafcao1_500.png" alt="" class="circle">
						      <span class="title"><%=nome%></span>
						      <a href="#!" class="secondary-content"><i class="material-icons">grade</i></a>
   						</li>
				    </ul>
            		<%
            			}
            		%>
            </fieldset>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script type="text/javascript" src="<c:url value = "/assets/libs/materialize/js/materialize.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value = "/assets/js/form.js"/>"></script>
    <script type="text/javascript" src="<c:url value = "/assets/js/validacoes.js"/>"></script>
  </body>
</html>
