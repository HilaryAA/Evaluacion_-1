package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class Rubro {
	
	Proveedor proveedor = new Proveedor();
	Articulo articulo = new Articulo();
	
	private String rb_descripcion;
	private int rb_id;
	
	public String rb_descripcion(){
		return rb_descripcion;
	}
	public int rb_id(){
		return rb_id;
	}

}
