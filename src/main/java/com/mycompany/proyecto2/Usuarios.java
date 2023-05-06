/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2;

import java.util.ArrayList;

/**
 *
 * @author epa
 */
public class Usuarios {
      private static ArrayList<String> elementos = new ArrayList<>();

    public static void agregarElemento(String elemento) {
        elementos.add(elemento);
    }

    public static ArrayList<String> obtenerElementos() {
        return elementos;
    }
}
