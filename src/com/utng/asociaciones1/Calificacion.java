package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class Calificacion {
	
	Proveedor proveedor = new Proveedor();
	ProveedorCalificado provcali = new ProveedorCalificado();
	
	private int cal_id;
	private String cal_descripcion;
	
	public int cal_id(){
		return cal_id;
	}
	public String cal_descripcion(){
		return cal_descripcion;
	}
	

}
