package com.utng.asociaciones2;
/**
 * 
 * @author HILARY
 *
 */
public class Pago {
	
	public Orden orden;
	
	private double Subtotal;
	private double Propina;
	private double Impuestos;
	
		
	
	
	public double Subtotal(){
		return Subtotal;
	}
	public double Propina(){
		return Propina;
	}
	public double Impuestos(){
		return Impuestos;
	}

}
