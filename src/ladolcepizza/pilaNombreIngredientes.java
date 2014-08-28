/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladolcepizza;

/**
 *
 * @author SABAGIP
 */
public class pilaNombreIngredientes {

    private final int MAXIMO = 4;
    private String[] ingredientes;
    private int tope;

    public pilaNombreIngredientes() {
        this.ingredientes = new String[MAXIMO];
        tope = -1;
    }

    public boolean esVacia() {
        return tope == -1;
    }

    public boolean esLlena() {
        return tope == 3;
    }

    public void apilar(String a) {
        if (esLlena()) {
            System.out.println("Pila de ingredientes llena");
        } else {
            tope++;
            this.ingredientes[tope] = a;
        }
    }

    public String desapilar() {
        String ingrediente = "";
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            ingrediente = ingredientes[tope];
            tope--;
        }
        return ingrediente;
    }

    public void vaciar() {
        while (esVacia() == false) {
            ingredientes[tope] = "";
            tope--;
        }
    }

    public int tamanio() {
        return tope + 1;
    }

    public String cima() {
        return ingredientes[tope];
    }

    public String mostrarIngredientes() {
       String ingrediente = "";
        while (esVacia() == false) {

            if (tope == 0) {
                ingrediente = ingrediente + ingredientes[tope];
                tope--;
            } else {  
                ingrediente = ingrediente + ingredientes[tope] + ",";
                tope--; 
                
            }
            
        }
        return ingrediente;
    }
}
