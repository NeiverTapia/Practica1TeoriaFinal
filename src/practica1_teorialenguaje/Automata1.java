/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_teorialenguaje;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

/**
 *
 * @author Neiver Tapia
 */
public class Automata1 {
    
    int cont=0;
    char[] enterChar;
    boolean cad =false;
    
    public Automata1(int cont, char[] caracter, boolean cadena){
        this.cont=cont;
        this.enterChar=caracter;
        this.cad=cadena;
    }
    public Automata1(){
        
    }
    
    
//Primer metodo que llamo desde MAIN para empezar el juego :v
    public void inicio() {
        q035810();
    }

    public void q035810() {

        if (cont < enterChar.length) {
            switch (enterChar[cont]) {
                case 'F':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q1();
                    break;
                case 'V':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q1();
                    break;
                case '!':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q6();
                    break;
                default:
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q11();
                    break;
            }
        }
    }

    private void q11() {

        //   JOptionPane.showMessageDialog(null, "La cadena ingresada no es correcta y el valor incorrecto es: "+ enterChar[cont]);
        cad = false;
    }

    private void q1() {

        if (cont < enterChar.length) {

            switch (enterChar[cont]) {
                case '&':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q2();

                    break;
                case '|':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q4();

                    break;
                case '!':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q79();

                    break;
                case '=':
                    System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                    cont++;
                    q79();

                    break;
                case 'V':
                    cont++;
                    q11();
                    break;
                case 'F':
                    cont++;
                    q11();
                    break;
            }
        } else {
            cad = true;
        }
    }

    private void q79() {

        if (cont < enterChar.length) {
            if (enterChar[cont] == '=') {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q035810();
            } else {
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

    private void q2() {
        char y = '&';
        if (cont < enterChar.length) {
            if (enterChar[cont] == y) {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q035810();
            } else {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

    private void q4() {
        char o = '|';
        if (cont < enterChar.length) {
            if (enterChar[cont] == o) {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q035810();
            } else {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

    private void q6() {
        if (cont < enterChar.length) {
            if (enterChar[cont] == 'V' || enterChar[cont] == 'F') {
                System.out.println("Estamos en el estado " + cont + " El valor de la cadena es: " + enterChar[cont]);
                cont++;
                q1();
            } else {
                cont++;
                q11();
            }
        } else {
            q11();
        }
    }

//    public String Mostrar(){
//        return String cadV = new String(enterChar); 
//    }
    
    
    
}
