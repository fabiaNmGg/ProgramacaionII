package SegndoExamen;

public class Pintura extends Obra {
	 private String genero;
	 public Pintura(String titulo, String material, Artista a1, Artista a2, String genero) {
	     super(titulo, material, a1, a2);
	     this.genero = genero; }
	 public String getGenero() {
	     return genero;}}
