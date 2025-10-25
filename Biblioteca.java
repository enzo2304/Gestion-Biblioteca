import java.util.*;

public class Biblioteca {
   private String nombre;
   private HashMap<Integer,Socio> socios;
   //esto tendria que ser hashmap? el de socios
   private ArrayList<Libro> libros;

   public Biblioteca(String p_nombre) {
      this.setNombre(p_nombre);
      this.setSocios(new HashMap<Integer,Socio>());
      this.setLibros(new ArrayList<Libro>());
   }

   public Biblioteca(String p_nombre, HashMap<Integer,Socio> p_socios,  ArrayList<Libro> p_libros) {
      this.setNombre(p_nombre);
      this.setSocios(p_socios);
      this.setLibros(p_libros);
   }
   //setter
   private void setNombre(String p_nombre){
       this.nombre = p_nombre;
   }
}