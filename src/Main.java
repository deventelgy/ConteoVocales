import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String cadena= JOptionPane.showInputDialog("Ingresar un texto");

        //String cadena = "Huanuco con la mejor clima del mundo";
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='a'||
                    cadena.charAt(i)=='e'||
                    cadena.charAt(i)=='i'||
                    cadena.charAt(i)=='o'||
                    cadena.charAt(i)=='u'){
                contador=contador+1;
            }
        }
        System.out.println("Las vocales son: "+contador);
    }
}