function onlyNumber(num){
      var er = /[^0-9.]/;
       er.lastIndex = 0;
       var campo = num;
       if (er.test(campo.value)) {
         campo.value = "";
       }

}

function validar(){
  var titulo = document.formulario.titulo.value;
  var numero = document.formulario.numero.value;
  var categoria = document.formulario.categoria.value;
  if(titulo != "" && numero  != ""  && categoria  != ""){
	 console.log(categoria);
	$.ajax({
		type:"post",
		url:"/projeto/index/save?titulo="+ titulo + "&numero=" + numero + "&categoria=" + categoria
	});
    return true;
  }
  else{
    alert("Preencha todos os campos e selecione uma categoria!");
    return false;
  }
}
function callList(){
	$.ajax({
		type:"post",
		url:"list"
	});
}
