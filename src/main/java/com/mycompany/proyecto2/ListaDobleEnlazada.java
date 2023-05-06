/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

/**
 *
 * @author epa
 */
public class ListaDobleEnlazada {
    
    private Nodo inicio;
    private Nodo fin;

     public Nodo getInicio() {
        return inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertarAlInicio(String imagen) {
        Nodo nuevo = new Nodo(imagen);
        if (estaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    public void insertarAlFinal(String imagen) {
        Nodo nuevo = new Nodo(imagen);
        if (estaVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setAnterior(fin);
            fin = nuevo;
        }
    }

    public void eliminarAlInicio() {
        if (!estaVacia()) {
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
    }

    public void eliminarAlFinal() {
        if (!estaVacia()) {
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                fin = fin.getAnterior();
                fin.setSiguiente(null);
            }
        }
    }

    public void recorrerLista() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.getImagen());
            actual = actual.getSiguiente();
        }
    }

}

   
