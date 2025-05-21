package SegndoExamen;

public class Anuncio {
	private int numero;
    private double precio;
    public Anuncio(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;}}