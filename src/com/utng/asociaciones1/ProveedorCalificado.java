package com.utng.asociaciones1;
/**
 * 
 * @author HILARY
 *
 */
public class ProveedorCalificado {
	
	Calificacion calificacion = new Calificacion();
	
	java.util.Date utilDate = new java.util.Date();
	
	private int cal_id;
	private int pr_id;
	private long FechaCalificacion;
	
	public int cal_id(){
		return cal_id;
	}
	public int pr_id(){
		return pr_id;
	}
	public long FechaCalificacion(){
		return FechaCalificacion;
	}

}
