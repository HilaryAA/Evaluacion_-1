package com.utng.asociaciones2;
/**
 * 
 * @author HILARY
 *
 */
public class Orden {
	
	public Pago pago;
	Bebida bebida;
	public Orden(Bebida drink){
		bebida = drink;
	}
	Platillo platillo;
	public Orden(Platillo dish){
		platillo = dish;
	}
	
	private int Hora;
	private String Mesero;
	
	public int Hora(){
		return Hora;
	}
	public String Mesero(){
		return Mesero;
	}
	

}
