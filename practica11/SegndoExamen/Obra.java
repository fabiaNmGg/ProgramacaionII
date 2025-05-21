package SegndoExamen;

public class Obra {
	 private String titulo;
	 private String material;
	 private Artista a1, a2;
	 private Anuncio b;
	 public Obra(String titulo, String material, Artista a1, Artista a2) {
	     this.titulo = titulo;
	     this.material = material;
	     this.a1 = a1;
	     this.a2 = a2;
	     this.b = null;
	 }
	 public void setAnuncio(Anuncio anuncio) {
	     this.b = anuncio;
	 }
	 public Anuncio getAnuncio() {
	     return b;
	 }
	 public Artista getA1() {
	     return a1;
	 }
	 public Artista getA2() {
	     return a2;}}
