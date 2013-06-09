
package Inventario.Control;

import Inventario.Datos.Autor;
import Inventario.Datos.Pais;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public class CAutor {
    
    Autor autor;
    
//----------------------------- CONSTRUCTOR ------------------------------//
    
    public CAutor() {
        autor = new Autor();
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }
    
//--------------------------- REGISTRAR -----------------------------------//

    public int registrar(String nombre, String apellidos, int idPais, Integer estado) {
        autor.setNombre(nombre);
        autor.setApellidos(apellidos);
        autor.setPais(new Pais(idPais));
        autor.setEstado(estado);       
        autor.insertar();
        return autor.getId();
    }
    
//--------------------------- MODIFICAR -----------------------------------//
    
    public void modificar(int id, String nombre, String apellidos, int idPais, Integer estado) {
        autor.setId(id);
        autor.setNombre(nombre);
        autor.setApellidos(apellidos);
        autor.setPais(new Pais(idPais));
        autor.setEstado(estado);
        autor.modificar();
    }
 
//--------------------------- ELIMINAR -----------------------------------//
    
      public void eliminar(int codigo){
        autor.setId(codigo);
        autor.eliminar();
    }

//--------------------------- LISTAR -----------------------------------//
      
    public ArrayList<Autor> ObtenerLista(){
        ArrayList<Autor> lista = autor.listar();
        return lista;
    }

    public ArrayList<Autor> ObtenerLista(int estado){
        ArrayList<Autor> lista = autor.obtenerLista(estado);
        return lista;
    }

//--------------------------- BUSCAR POR CODIGO ---------------------------//

    public Autor buscar(int codigo){
        autor.setId(codigo);
        boolean encontro = autor.obtener(codigo);
        if(encontro){
            return autor;
        }else{
            return null;
        }
    }

    public void modificarEstado(int estado,Integer codigo){
        autor.setId(codigo);
        autor.setEstado(estado);
        autor.modificarEstado();
    }
}
