<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
            <span class="card-title">Cadastro de Livros</span>

            <div class="row">
              <form class="col s12" method="post" name="formulario">
                <div class="row">
                  <div class="input-field col s12 m6">
                    <i class="material-icons prefix">book</i>
                    <input id="icon_prefix" type="text" class="validate" name="titulo" id="titulo">
                    <label for="icon_prefix">Titulo do Livro</label>
                  </div>
                  <div class="input-field col xs12 s12 m6">
                    <i class="material-icons prefix">bookmark_border</i>
                    <input id="icon_telephone" type="text" class="validate" name="numero" onkeyup="onlyNumber(this)" >
                    <label for="icon_telephone">Número de paginas</label>
                  </div>
                </div>

                <div class="row">

                  <div class="input-field col s12">
                    <select name="categoria">
                      <option value="" disabled selected>Categoria</option>
                      <option value="Técnico">Técnico</option>
                      <option value="Romance">Romance</option>
                      <option value="Ficção">Ficção</option>
                      <option value="Drama">Drama</option>
                    </select>
                    <label>Categoria do Livro</label>
                  </div>

                </div>
                <center>
                <div class="row">
                	<div class="card-action col m4 offset-m4">
              			<button class="waves-effect waves-light btn" name="btnCadastrar" onclick="return validar()" style="width: 150px;">Cadastrar</button>
              			<a href="list" target="_self" class="waves-effect waves-light btn" name="btnListarClientes" style="width: 150px;margin-top: 6px;">listar</a>
            		</div>
                </div>
              </form>
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
