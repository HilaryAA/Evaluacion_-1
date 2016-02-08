package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class Pedido {
	
	java.util.Date utilDate = new java.util.Date();
	
	private double pe_id;
	private int pe_estado;
	private long pe_fechapedido;
	private long pe_fechanecesidad;
	private long pe_fechaprogramada;
	private long pe_fechaentrega;
	
	public double pe_id(){
		return pe_id;
	}
	public int pe_estado(){
		return pe_estado;
	}
	public long pe_fechapedido(){
		return pe_fechapedido;
	}
	public long pe_fechanecesidad(){
		return pe_fechanecesidad;
	}
	public long pe_fechaprogramada(){
		return pe_fechaprogramada;
	}
	public long pe_fechaentrega(){
		return pe_fechaentrega;
	}
	
	
	

}
