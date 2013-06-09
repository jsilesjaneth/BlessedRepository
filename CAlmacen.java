/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario.Control;

import Inventario.Datos.Almacen;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public class CAlmacen {
    
    Almacen almacen;

//----------------------------- CONSTRUCTOR ------------------------------//

    public CAlmacen() {
        almacen = new Almacen();
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    public Almacen getAlmacen() {
        return almacen;
    }
    
//--------------------------- INSERTAR -----------------------------------//
    
    public Integer registrar(String nombre, String lugar, Integer estado) {
        almacen.setNombre(nombre);
        almacen.setLugar(lugar);
        almacen.setEstado(estado);
        Integer id = almacen.insertar();
        return id;
    }
    
 //--------------------------- MODIFICAR -----------------------------------//
    
    public void modificar(int id,String nombre, String lugar, Integer estado) {
        almacen.setId(id);
        almacen.setNombre(nombre);
        almacen.setLugar(lugar);
        almacen.setEstado(estado);
        almacen.modificar();
    }
   
 //--------------------------- ELIMINAR -----------------------------------//
    
    public void eliminar(int codigo){
        almacen.setId(codigo);
        almacen.eliminar();
    }
  
 //--------------------------- LISTAR -----------------------------------//
    
    public List ObtenerLista(){
        List lista = almacen.listar();
        return lista;
    }    

//--------------------------- BUSCAR POR CODIGO -----------------------------//
    
    public Almacen buscar(int codigo){
        almacen.setId(codigo);
        boolean encontro = almacen.obtener(codigo);
        if(encontro){
            return almacen;
        }else{
            return null;
        }
    }    
}
