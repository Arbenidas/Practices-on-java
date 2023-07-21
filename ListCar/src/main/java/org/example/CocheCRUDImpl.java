package org.example;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    private String nombre;
    private String modelo;
    private String matricula;

    public CocheCRUDImpl() {
        this.nombre = nombre;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void imprimir(CocheCRUDImpl coche){
        System.out.println("Nombre: "+coche.getNombre()+"\n"+
                            "Modelo: "+coche.getModelo()+"\n"+
                            "Matricula: "+coche.getMatricula()+"\n");

    }

    @Override
    public void findAll(List<CocheCRUDImpl>coches, String nombre) {
    for (CocheCRUDImpl busqueda :coches){
        if (coches.isEmpty()){
            System.out.println("No existen coches en la base de datos");
        } else if (busqueda.getNombre().equals(nombre)){
            System.out.println("coche en base de datos");
        }else {
            System.out.println("coche no encontrado");
        }
    }

    }


}
