package com.utng.ayc;
/**
 * 
 * @author HILARY
 *
 */
public class Motor {
	
	private int revolucionesporminuto;
	private boolean activo;
	
	public Motor(){
		
	}
	public int cambiarevolucionesporminuto(int rpm){
		return rpm;
	}
	public static void activa(){
		
	}
	public static void desactiva(){
		
	}
	public boolean estaactivo(){
		return true;
	}
	public int getrevolucionesporminuto(){
		return revolucionesporminuto;
	}
	public void setrevolucionesporminuto(int valor){
		this.revolucionesporminuto = valor;
	}
	public boolean getactivo(){
		return activo;
	}
	public void setactivo(){
		this.activo = true;
		this.activo = false;
	}

}
