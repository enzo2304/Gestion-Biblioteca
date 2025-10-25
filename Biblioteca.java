import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;

public class Biblioteca {
   private String nombre;
   private ArrayList<Socio> socios;
   private ArrayList<Libro> libros;

   public Biblioteca(String p_nombre) {
      this.setNombre(p_nombre);
      this.setSocios(new ArrayList());
      this.setLibros(new ArrayList());
   }

   private void setNombre(String p_nombre) {
      this.nombre = p_nombre;
   }

   private void setSocios(ArrayList<Socio> p_socios) {
      this.socios = p_socios;
   }

   private void setLibros(ArrayList<Libro> p_libros) {
      this.libros = p_libros;
   }

   public String getNombre() {
      return this.nombre;
   }

   public ArrayList<Socio> getSocios() {
      return this.socios;
   }

   public ArrayList<Libro> getLibros() {
      return this.libros;
   }

   public boolean addSocio(Socio p_socio) {
      return this.getSocios().add(p_socio);
   }

   public boolean removeSocio(Socio p_socio) {
      return this.getSocios().remove(p_socio);
   }

   public boolean addLibro(Libro p_libro) {
      return this.getLibros().add(p_libro);
   }

   public boolean removeLibro(Libro p_libro) {
      return this.getLibros().remove(p_libro);
   }

   public void nuevoLibro(String p_titulo, int p_edicion, String p_editorial, int p_anio) {
      this.addLibro(new Libro(p_titulo, p_edicion, p_editorial, p_anio));
   }

   public void nuevoSocioEstudiante(int p_dniSocio, String p_nombre, String p_carrera) {
      this.addSocio(new Estudiante(p_dniSocio, p_nombre, p_carrera));
   }

   public void nuevoSocioDocente(int p_dniSocio, String p_nombre, String p_area) {
      this.addSocio(new Docente(p_dniSocio, p_nombre, p_area));
   }
}