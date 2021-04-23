/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg2;

/**
 *
 * @author Edson Coj
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tarea 1
        System.out.println("Tarea 1");
        int elegir=6;
        
        switch (elegir){
            case 1: System.out.println("Usted eligio la opcion 1: Un Café");
            break;
            case 2: System.out.println("Usted eligio la opcion 2: Un Té");
            break;
            case 3: System.out.println("Usted eligio la opcion 3: Una limonada");
            break;
            case 4: System.out.println("Usted eligio la opcion 4: Un jugo de naranja");
            break;
            case 5: System.out.println("Usted eligio la opcion 5: Un Frappé");
            break;
            default: System.out.println("La opcion que elegiste, no esta disponible o no existe aún.");
            
        // Tarea 2
            
                System.out.println("Tarea 2");
            
       String accion="Correr";
        
        switch (accion){
            case "Correr": System.out.println("Usted debera correr 3 km.");
            break;
            case "Caminar": System.out.println("Usted dbera caminar 30 cuadras.");
            break;
            case "Saltar": System.out.println("Usted debera saltar cada vez que vea un obstaculo.");
            break;
            case "Comer": System.out.println("Usted debera comer 3 veces al dia (desayuno,almuerzo y cena)");
            break;
            case "Dormir": System.out.println("Debe dormir de 6 a 8 horas diarias.");
            break;
            default: System.out.println("No tenemos instrucciones para la acción solicitada");
            
                                   
            }      
        // Tarea 3
                System.out.println("Tarea 3");
            
             int momento=2;
             
            switch(momento){
               case 1: System.out.println("Durmiendo de 00:00 a 7 a.m"); 
               break;
               case 2: System.out.println("Despertar a las 7 a.m ");
               break;
               case 3: System.out.println("Tomar clases de 7 a 8 a.m");
               break;
               case 4: System.out.println("Desayunar a las 9 a.m");
               break;
               case 5: System.out.println("Clases de Algebra lineal a las 9:30 a 11:00");
               break;
               case 6: System.out.println("Clases de Organizacion Computacional a las 11:00 a 13:00");
               break;
               case 7: System.out.println("Clases de Fisica de 13:00 a 15:00");
               break;
               case 8: System.out.println("Libre de 15:00 a 19:00");
               break;
               case 9: System.out.println("Clases de Lenguaje de Programacion de 19:00 a 21:00");
               break;
               case 10: System.out.println("Libre de 21:00 a 00:00");
               break;
               default: System.out.println("No existe el numero del momento del dia solicitiado.");
       
            } 
                System.out.println("Tarea 4");
              int fecha=2;
              
              switch (fecha){
                  case 1: System.out.println("Domingo");
                  break;
                  case 2: System.out.println("Lunes");
                  break;
                  case 3: System.out.println("Martes");
                  break;
                  case 4: System.out.println("Miercoles");
                  break;
                  case 5: System.out.println("Jueves");
                  break;
                  case 6: System.out.println("Viernes");
                  break;
                  case 7: System.out.println("Sabado");
                  default: System.out.println("Unicamente dias del 1 al 7 en la semana inglesa");
                
                  
            }  
       }
    }
    
}
