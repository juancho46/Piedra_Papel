
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Persona {
    String alias;
    String correo;
    
    Scanner sc=new Scanner(System.in);
    
    public void solicitarDatosPersona(){
        System.out.println("Escriba un Alias");
        alias=sc.nextLine();
        System.out.println("Escriba su correo");
        correo=sc.next();
    }
    
    public void mostrarDatosPersona(){
        System.out.println(alias +"-"+ correo);
        
        
    }
    
}
