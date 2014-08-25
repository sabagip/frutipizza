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
public class PilaValorIngrediente {

    private final int MAXIMO = 3;
    private int[] V;
    private int tope;

    public PilaValorIngrediente() {
        this.V = new int[MAXIMO];
        this.tope = -1;
    }

    public boolean esVacia() {
        return tope == -1;
    }

    public boolean esLlena() {
        return tope == MAXIMO - 1;
    }

    public void apilar(int a) {
        if (esLlena()) {
            System.out.println("Pila Llena!");
        } else {
            tope++;
            V[tope] = a;
        }
    }

    public int desapilar() {
        int a = Integer.MIN_VALUE;
        if (esVacia()) {
            System.out.println("Pila Vacia!");
        } else {
            a = V[tope];
            tope--;
        }
        return a;
    }

    public void vaciar(PilaValorIngrediente B) {
        while (!B.esVacia()) {
            this.apilar(B.desapilar());
            
        }
    }

    public int tamanio() {
        return tope + 1;
    }

    public int cima() {
        return V[tope];
    }

    public void mostrar() {
        PilaValorIngrediente X = new PilaValorIngrediente();
        while (!esVacia()) {
            int a = desapilar();
            System.out.println(" " + a);
            X.apilar(a);
        }
        this.vaciar(X);
    }

}
