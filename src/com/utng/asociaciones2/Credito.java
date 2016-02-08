package com.utng.asociaciones2;
/**
 * 
 * @author HILARY
 *
 */
public class Credito extends Pago{
	
	private int Numerodecredito;
	private String Tipo;
	private long Fecha;
	private String Nombre;
	
	public boolean HacerCargo(double total){
		return true;
	}
	
	public int Numerodecredito(){
		return Numerodecredito;
	}
	public String Tipo(){
		return Tipo;
	}
	public long Fecha(){
		return Fecha;
	}
	public String Nombre(){
		return Nombre;
	}
}
