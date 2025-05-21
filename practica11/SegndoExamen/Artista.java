package SegndoExamen;

public class Artista {
	 private String nombre,ci;
	 private int añosExperiencia;
	 public Artista(String nombre, String ci, int añosExperiencia) {
	     this.nombre = nombre;
	     this.ci = ci;
	     this.añosExperiencia = añosExperiencia;
	 }
	 public String getNombre() {
	     return nombre;
	 }
	 public int getAñosExperiencia() {
	     return añosExperiencia;}}