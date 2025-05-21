package SegndoExamen;

public class main {
	public static void main(String[] args) {
        // a
        Artista artista1 = new Artista("Pablo Picasso", "123456", 50);
        Artista artista2 = new Artista("Vincent van Gogh", "654321", 40);
        Artista artista3 = new Artista("Claude Monet", "987654", 45);
        Artista artista4 = new Artista("Salvador Dalí", "456789", 55); 
        Anuncio anuncio1 = new Anuncio(1, 500000.0);
        Anuncio anuncio2 = new Anuncio(2, 750000.0);
        Pintura pintura1 = new Pintura("Guernica", "Óleo", artista1, artista2, "Cubismo");
        pintura1.setAnuncio(anuncio1);
        Pintura pintura2 = new Pintura("La persistencia de la memoria", "Óleo", artista3, artista4, "Surrealismo");
        pintura2.setAnuncio(anuncio2);
        System.out.println("b)"); 
        int totalArtistas = 0;
        int sumaExperiencia = 0;      
        if (pintura1.getA1() != null) {
            sumaExperiencia += pintura1.getA1().getAñosExperiencia();
            totalArtistas++;}
        if (pintura1.getA2() != null) {
            sumaExperiencia += pintura1.getA2().getAñosExperiencia();
            totalArtistas++; }
        if (pintura2.getA1() != null) {
            sumaExperiencia += pintura2.getA1().getAñosExperiencia();
            totalArtistas++; }
        if (pintura2.getA2() != null) {
            sumaExperiencia += pintura2.getA2().getAñosExperiencia();
            totalArtistas++;}
        double promedioExperiencia = (double) sumaExperiencia / totalArtistas;
        System.out.println("Promedio de años de experiencia: " + promedioExperiencia);
        System.out.println("c)");
        String nombreArtistaBuscado = "Cl"
        		+ "aude Monet";
        double incremento = 100000.0;
        if (pintura1.getA1() != null && pintura1.getA1().getNombre().equals(nombreArtistaBuscado) ||
            pintura1.getA2() != null && pintura1.getA2().getNombre().equals(nombreArtistaBuscado)) {
            if (pintura1.getAnuncio() != null) {
                double nuevoPrecio = pintura1.getAnuncio().getPrecio() + incremento;
                pintura1.getAnuncio().setPrecio(nuevoPrecio);
                System.out.println("Precio actualizado para pintura1: $" + nuevoPrecio);  } }
        if (pintura2.getA1() != null && pintura2.getA1().getNombre().equals(nombreArtistaBuscado) ||
            pintura2.getA2() != null && pintura2.getA2().getNombre().equals(nombreArtistaBuscado)) {
            if (pintura2.getAnuncio() != null) {
                double nuevoPrecio = pintura2.getAnuncio().getPrecio() + incremento;
                pintura2.getAnuncio().setPrecio(nuevoPrecio);
                System.out.println("Precio actualizado para pintura2: $" + nuevoPrecio);}}}}