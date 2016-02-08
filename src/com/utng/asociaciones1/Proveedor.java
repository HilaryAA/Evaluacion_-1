package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class Proveedor {
	
	Precios precio = new Precios();
	Articulo articulo = new Articulo();
	Calificacion calificacion = new Calificacion();
	
	
	private double pr_id;
	private int pr_CUIT;
	private String pr_RazonSocial;
	private String pr_Contacto;
	private String pr_Telefono1;
	private short pr_Telefono2;
	private String pr_Fax;
	private String pr_Email1;
	private String pr_Email2;
	private String pr_Web;
	
	public double pr_id(){
		return pr_id;
	}
	public int pr_CUIT(){
		return pr_CUIT;
	}
	public String pr_RazonSocial(){
		return pr_RazonSocial;
	}
	public String pr_Contacto(){
		return pr_Contacto;
	}
	public String pr_Telefono1(){
		return pr_Telefono1;
	}
	public short pr_Telefono2(){
		return pr_Telefono2;
	}
	public String pr_Fax(){
		return pr_Fax;
	}
	public String pr_Email1(){
		return pr_Email1;
	}
	public String pr_Email2(){
		return pr_Email2;
	}
	public String pr_Web(){
		return pr_Web;
	}
	
	

}
