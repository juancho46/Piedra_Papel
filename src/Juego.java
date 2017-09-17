
import java.util.Random;
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
public class Juego {
    int jugadaPersona;
    int jugadaCompu;
    String jugaPer;
    String jugaCom;
            
    public void jugar(){
        Persona obj=new Persona();
        System.out.println("***********************************");
        System.out.println("PIEDRA, PAPEL, TIJERA");
        obj.solicitarDatosPersona();
        System.out.println("comienza el juego");
        System.out.println("JUGADOR");
        obj.mostrarDatosPersona();
        
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++)
            {
                System.out.println("(RONDA "+i+")"); 
                System.out.println("Seleccione su jugada escribiendo un numero");
                System.out.println("0: Piedra");
                System.out.println("1: Papel");
                System.out.println("2: Tijera");
                int opcionPersona=sc.nextInt();
                switch(opcionPersona){
                    case 0:
                        jugaPer="Piedra";
                        break;
                    case 1:
                        jugaPer="Papel";
                        break;
                    case 2:
                        jugaPer="Tijera";
                        break;
                        
                }
               imprimirjugadaEnletras();
               
               if(jugaPer=="Piedra" && jugaCom=="Tijera"){
                   jugadaPersona=jugadaPersona+1;
                   
               }else if(jugaPer=="Papel" && jugaCom=="Piedra"){
                   jugadaPersona=jugadaPersona+1;
               }else if(jugaPer=="Tijera" && jugaCom=="Papel"){
                   jugadaPersona=jugadaPersona+1;
               }else if(jugaPer=="Piedra" && jugaCom=="Papel"){
                   jugadaCompu=jugadaCompu+1;
               }else if(jugaPer=="Tijera" && jugaCom=="Piedra"){
                   jugadaCompu=jugadaCompu+1;
               }else if(jugaPer=="Papel" && jugaCom=="Tijera"){
                   jugadaCompu=jugadaCompu+1;
               }
                
            }
        buscarElmprimirGanadorFinal();
        
    }
    
    public void generarJuegoComputador(){
        Random R=new Random();
    int jugada=R.nextInt(3);
    switch(jugada){
                    case 0:
                        jugaCom="Piedra";
                        break;
                    case 1:
                        jugaCom="Papel";
                        break;
                    case 2:
                        jugaCom="Tijera";
                        break;
                        
                }
    }
    
    public void imprimirjugadaEnletras(){
        generarJuegoComputador();
        System.out.println("===========");
                System.out.println("Jugada Persona: "+jugaPer);
                System.out.println("Jugada Computador: "+jugaCom);
                System.out.println("==============");
                if(jugaPer==jugaCom){
                    System.out.println("EMPATE");
                    
                }
    }
    
    public void buscarElmprimirGanadorFinal(){
        System.out.println("--------GANADOR---------");
        if(jugadaCompu>jugadaPersona){
            System.out.println("Computador");
            System.out.println("Numero de Aciertos: "+jugadaCompu);
            
        }else{
        System.out.println("Persona");
            System.out.println("Numero de Aciertos: "+jugadaPersona);
        }
}
}