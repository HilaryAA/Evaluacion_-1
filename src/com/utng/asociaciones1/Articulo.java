package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class Articulo {
	
	Pedido pedido = new Pedido();
	Proveedor proveedor = new Proveedor();
	Precios precio = new Precios();
	
	private String art_id;
	private String art_descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadcritica;
	private double art_cantidadminima;
	
	public String art_id(){
		return art_id;
	}
	public String art_descrpcion(){
		return art_descripcion;
	}
	public int art_estado(){
		return art_estado;
	}
	public int art_tipo(){
		return art_tipo;
	}
	public int art_cantidad(){
		return art_cantidad;
	}
	public double art_cantidadcritica(){
		return art_cantidadcritica;
	}
	public double art_cantidadminima(){
		return art_cantidadminima;
	}
	
}
