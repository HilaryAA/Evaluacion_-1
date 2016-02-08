package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class Precios {
	
	Proveedor proveedor = new Proveedor();
	Articulo articulo = new Articulo();
	
	private double pre_id;
	private double art_id;
	private double pr_id;
	private float pr_pesos;
	private int pr_dolar;
	private float pr_cotizaciondolar;
	
	public double pre_id(){
		return pre_id;
	}
	public double art_id(){
		return art_id;
	}
	public double pr_id(){
		return pr_id;
	}
	public float pr_pesos(){
		return pr_pesos;
	}
	public int pr_dolar(){
		return pr_dolar;
	}
	public float pr_cotizaciondolar(){
		return pr_cotizaciondolar;
	}
	
	

}
