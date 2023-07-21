package org.example;

import java.util.List;

public interface CocheCRUD {


    void imprimir(CocheCRUDImpl datos);

    void findAll(List<CocheCRUDImpl> datos,String nombre);
}
