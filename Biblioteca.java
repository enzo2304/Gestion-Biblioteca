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
   
   public Biblioteca(String p_nombre,HashMap<Integer,Socio> p_socios) {
      this.setNombre(p_nombre);
      this.setSocios(p_socios);
      this.setLibros(new ArrayList<Libro>());
   } 
   
   public Biblioteca(String p_nombre, ArrayList<Libro> p_libros) {
      this.setNombre(p_nombre);
      this.setSocios(new HashMap<Integer,Socio>());
      this.setLibros(p_libros);
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
   private void setLibros(ArrayList<Libro> p_libros){
       this.libros = p_libros;
   }
   private void setSocio(HashMap<Integer,Socio> p_socios){
       this.socios = p_socios;
   }
   
   //getter
   public String getNombre(){
       return this.nombre;
   }
   public HashMap<Integer,Socio> getSocios(){
       return this.socios;
   }
   public ArrayList<Libro> getLibros(){
       return this.libros;
   }
   
   //agregar libros o socios
   
   public void agregarLibro(Libro p_libro){
       this.getLibros().add(p_libro);
   }
   public void agregarSocio(Socio p_socio){
       //aca vamos a tener que ver como le llaman al getDni o getDniSocio
       this.getSocios().put(new Integer(p_socio.getDni) , p_socio);
   }
   
   
   //eliminar libro o socio
   public void quitarLibro(Libro p_libro){
       this.getLibros().remove(p_libro);
   }
   public void eliminarSocio(Socio p_socio){
       this.getSocios().remove(new Integer(p_socio.getDni));
   }
   
   public void nuevoLibro(String p_titulo, int p_edicion,String p_editorial, int p_anio){
       //aca el mismo dilema de como acomodan los parametros en el constructor 
       this.agregarLibro(new Libro(p_titulo,p_edicion,p_editorial,p_anio));
   }
   
   public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera){
       this.agregarSocio(new Estudiante(p_dniSocio,p_nombre,p_carrera));
   }
   
   public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area){
       this.agregarSocio(new Docente(p_dniSocio,p_nombre,p_are));
   }
}