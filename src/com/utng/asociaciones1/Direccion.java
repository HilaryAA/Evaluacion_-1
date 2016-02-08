package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class Direccion {
	
	Proveedor proveedor = new Proveedor();
	
	private String Calle;
	private String Numero;
	private String Departamento;
	private String CP;
	private String Localidad;
	private String Provincia;
	private String Pais;
	private int Piso;
	
	public String Calle(){
		return Calle;
	}
	public String Numero(){
		return Numero;
	}
	public String Departamento(){
		return Departamento;
	}
	public String CP(){
		return CP;
	}
	public String Localidad(){
		return Localidad;
	}
	public String Provincia(){
		return Provincia;
	}
	public String Pais(){
		return Pais;
	}
	public int Piso(){
		return Piso;
	}
	

}
