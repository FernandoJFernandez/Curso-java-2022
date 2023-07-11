<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Video 237-238: Lista de compra</title>
</head>
<body>
	<%@ page import = "java.util.*" %>
	
	<form name="Formulario_Compra" action="ListaDeCompra.jsp"> 
	  <p>Artículos a comprar:</p>
	  <p>
	    <label><input type="checkbox" name="articulos" value="agua " >Agua </label>
	    <br>
	    <label><input type="checkbox" name="articulos" value="leche" >Leche </label>
	    <br>
	    <label><input type="checkbox" name="articulos" value="pan" >Pan </label>
	    <br>
	    <label><input type="checkbox" name="articulos" value="mazanas" >Manzanas </label>
	    <br>
	    <label><input type="checkbox" name="articulos" value="carne" >Carne </label>
	    <br>
	    <label><input type="checkbox" name="articulos" value="pescado" >Pescado </label>
	  </p>
	  <p>
	    <input type="submit" name="button" id="button" value="Enviar">
	    <br>
	  </p>
	</form>
	
	<h2>Carro de la compra</h2>
	<ul>
	<%
		//Guarda los elementos elegidos en el carro de la compra.
		List<String> ListaElementos = (List<String>) session.getAttribute("misElementos");
		if(ListaElementos==null){
			ListaElementos = new ArrayList<String>();
			session.setAttribute("misElementos", ListaElementos);
		}
		
		//Rescata los datos del formulario, cuando el usuario pulsa el botón de enviar. 
		String[]elementos = request.getParameterValues("articulos");
		if(elementos!=null){
			for(String elemTemp : elementos){
				ListaElementos.add(elemTemp);
			}
		}
		
		//Imprime el arraylist
		for(String elemTemp : ListaElementos){
			out.println("<li>" + elemTemp + "</li>");
		}
	%>
	</ul>
</body>
</html>