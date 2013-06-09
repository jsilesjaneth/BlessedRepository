/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario.Control;

import Inventario.Datos.Area;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Janeth
 * realizando cambios
 */
public class CArea {

    Area area;
    
//----------------------------- CONSTRUCTOR ------------------------------//
    
    public CArea() {
        area = new Area();
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

//--------------------------- INSERTAR -----------------------------------//
    
    public Integer registrar(String nombre, String descripcion, Integer estado) {
        area.setNombre(nombre);
        area.setDescripcion(descripcion);
        area.setEstado(estado);
        Integer id = area.insertar();
        return id;
    }
    
 //--------------------------- MODIFICAR -----------------------------------//
    
    public void modificar(int id,String nombre, String descripcion, Integer estado) {
        area.setId(id);
        area.setNombre(nombre);
        area.setDescripcion(descripcion);
        area.setEstado(estado);
        area.modificar();
    }
   
 //--------------------------- ELIMINAR -----------------------------------//
    
    public void eliminar(int codigo){
        area.setId(codigo);
        area.eliminar();
    }
  
 //--------------------------- LISTAR -----------------------------------//
    
    public List ObtenerLista(){
        List lista = area.listar();
        return lista;
    }    

//--------------------------- BUSCAR POR CODIGO -----------------------------//
    
    public Area buscar(int codigo){
        area.setId(codigo);
        boolean encontro = area.obtener(codigo);
        if(encontro){
            return area;
        }else{
            return null;
        }
    }
}
