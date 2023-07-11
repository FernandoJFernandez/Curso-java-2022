package com.pildorasinformaticas.productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import javax.sql.DataSource;

public class ModeloProductos {

	private DataSource origenDatos;
	
	public ModeloProductos(DataSource origenDatos) {
		//Pool de conexión
		this.origenDatos = origenDatos;
	}
	
	public List<Productos> getProductos() throws Exception{

		List<Productos> productos = new ArrayList<>();
		
		//Crear conexión con bbdd
		Connection miConexion = null;
		Statement miStatement = null;
		ResultSet miResultSet= null;
		

		//Usamos el pool para establecer la conexión con la bbdd
		miConexion=origenDatos.getConnection();
			
		//Crear sentencia sql y statement
		String instruccionSql = "SELECT * FROM PRODUCTOS";
		miStatement = miConexion.createStatement();
			
		//Ejecuta sql
		miResultSet = miStatement.executeQuery(instruccionSql);
			
		//Recorrer el resulset obtenido
		while(miResultSet.next()) {
			String c_art = miResultSet.getString("CÓDIGOARTÍCULO");
			String seccion = miResultSet.getString("SECCIÓN");
			String nArt = miResultSet.getString("NOMBREARTÍCULO");
			String precio = miResultSet.getString("PRECIO");
			String fecha = miResultSet.getString("FECHA");
			String importado = miResultSet.getString("IMPORTADO");
			String pOrig = miResultSet.getString("PAÍSDEORIGEN");
				
			Productos tempProd = new Productos(c_art,seccion,nArt,precio,fecha,importado,pOrig);
			productos.add(tempProd);
		}
		return productos;
	}

	public void agregarElNuevoProducto(Productos nuevoProducto) throws Exception{
		//Obtener la conexión
		Connection miConexion = null;
		PreparedStatement miStatement = null;

		try {
			miConexion=origenDatos.getConnection();
		
			//Crear instrucción sql que inserte el producto
			String sql = "INSERT INTO PRODUCTOS (CÓDIGOARTÍCULO, SECCIÓN, NOMBREARTÍCULO, PRECIO, FECHA, IMPORTADO, PAÍSDEORIGEN)"+
						 "VALUES(?,?,?,?,?,?,?)";
			miStatement = miConexion.prepareStatement(sql);
			
			//Establecer parámetros para el producto
			miStatement.setString(1, nuevoProducto.getcArt());
			miStatement.setString(2, nuevoProducto.getSeccion());
			miStatement.setString(3, nuevoProducto.getnArt());
			miStatement.setString(4, nuevoProducto.getFecha());
			miStatement.setString(5, nuevoProducto.getPrecio());
			miStatement.setString(6, nuevoProducto.getImportado());
			miStatement.setString(7, nuevoProducto.getpOrig());

			//Ejecutar la instrucción sql
			miStatement.execute();
		
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			miStatement.close();
			miConexion.close();
		}
	}

	public Productos getProducto(String codigoArticulo) {
		
		Productos elProducto=null;
		Connection miConexion = null;
		PreparedStatement miStatement = null;
		ResultSet miResultSet= null;
		String cArticulo = codigoArticulo;
		
		//Establecer la conexión con la BBDD
		try {
			miConexion=origenDatos.getConnection();

			//Crear sql que busque el producto
			String sql = "SELECT * FROM PRODUCTOS WHERE CÓDIGOARTÍCULO=?";

			//Crear la consulta preparada
			miStatement = miConexion.prepareStatement(sql);
			
			//Establecer los parámetros
			miStatement.setString(1, cArticulo);

			//Ejecutar consulta
			miResultSet = miStatement.executeQuery();	
				
			//Obtener los datos de respuesta
			if(miResultSet.next()) {
				String c_art = miResultSet.getString("CÓDIGOARTÍCULO");
				String seccion = miResultSet.getString("SECCIÓN");
				String nArt = miResultSet.getString("NOMBREARTÍCULO");
				String precio = miResultSet.getString("PRECIO");
				String fecha = miResultSet.getString("FECHA");
				String importado = miResultSet.getString("IMPORTADO");
				String pOrig = miResultSet.getString("PAÍSDEORIGEN");
				
				elProducto = new Productos(c_art,seccion,nArt,precio,fecha,importado,pOrig);
			}else{
				throw new Exception("No hemos encontrado el producto con código artículo= " + cArticulo);
			}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		return elProducto;
	}

	public void actualizarProducto(Productos productoActualizado) throws Exception{
		Connection miConexion = null;
		PreparedStatement miStatement = null;
		
		//Establecer la conexión con la BBDD
		try {
			miConexion=origenDatos.getConnection();

			//Crear sentencia sql
			String sql = "UPDATE PRODUCTOS SET SECCIÓN=?, NOMBREARTÍCULO=?, PRECIO=?, FECHA=?, IMPORTADO=?, PAÍSDEORIGEN=?" + 
						 "WHERE CÓDIGOARTÍCULO=?";

			//Crear la consulta preparada
			miStatement = miConexion.prepareStatement(sql);
			
			//Establecer los parámetros
			miStatement.setString(1, productoActualizado.getSeccion());
			miStatement.setString(2, productoActualizado.getnArt());
			miStatement.setString(3, productoActualizado.getPrecio());
			miStatement.setString(4, productoActualizado.getFecha());
			miStatement.setString(5, productoActualizado.getImportado());
			miStatement.setString(6, productoActualizado.getpOrig());
			miStatement.setString(7, productoActualizado.getcArt());

			//Ejecutar consulta
			miStatement.execute();
			
		} finally {
			miStatement.close();
			miConexion.close();
		}
	}

	public void eliminarProducto(String codArticulo) throws Exception{
		Connection miConexion = null;
		PreparedStatement miStatement = null;
		
		//Establecer la conexión con la BBDD
		try {
			miConexion=origenDatos.getConnection();

			//Crear sentencia sql de eliminación
			String sql = "DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO=?";

			//Crear la consulta preparada
			miStatement = miConexion.prepareStatement(sql);
			
			//Establecer los parámetros
			miStatement.setString(1, codArticulo);

			//Ejecutar consulta
			miStatement.execute();
			
		} finally {
			miStatement.close();
			miConexion.close();
		}
		
	}
}
