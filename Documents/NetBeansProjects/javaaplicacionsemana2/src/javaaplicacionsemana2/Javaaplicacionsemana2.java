/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaaplicacionsemana2;

import javax.swing.JOptionPane;

/**
 *
 * @author fran1
 */
public class Javaaplicacionsemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int edad;
    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su edad:"));
    if (edad>= 18){
     JOptionPane.showConfirmDialog(null,"Si puede votar");
    }else
        JOptionPane.showConfirmDialog(null, "No puede votar");
     
    int nota;
    nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su nota del curso anterior:"));
     if (nota>= 70){
         JOptionPane.showConfirmDialog(null, "Aprobado");
     }else
         JOptionPane.showConfirmDialog(null, "Reprobado");
    
    String dia =JOptionPane.showInputDialog(null,"Ingrese el numero correspondiente al dia que desee");
       switch (dia){
        case "1":
            JOptionPane.showConfirmDialog(null, "Es lunes");
            break;
        case "2":
            JOptionPane.showConfirmDialog(null, "Es martes");
            break;
        case "3":
            JOptionPane.showConfirmDialog(null, "Es miercoles");   
            break;
        case "4":
            JOptionPane.showConfirmDialog(null, "Es jueves");   
            break;
        case "5":
            JOptionPane.showConfirmDialog(null, "Es viernes");   
            break;
        case "6":
            JOptionPane.showConfirmDialog(null, "Es sabado");   
            break;
        case "7":
            JOptionPane.showConfirmDialog(null, "Es domingo");   
            break;
        default:
            JOptionPane.showConfirmDialog(null, "El numero que ingreso es erroneo");
              dia = JOptionPane.showInputDialog(null, "Ingrese cualquer dia de la semana");
        switch (dia){
        case "Lunes":
            JOptionPane.showConfirmDialog(null, "Dia laboral");
            break;
        case "Martes":
            JOptionPane.showConfirmDialog(null, "Dia laboral");
            break;
         case "Miercoles":
            JOptionPane.showConfirmDialog(null, "Dia laboral");   
            break;
         case "Jueves":
            JOptionPane.showConfirmDialog(null, "Dia laboral");   
            break;
         case "Viernes":
            JOptionPane.showConfirmDialog(null, "Dia laboral");   
            break;
         case "Sabado":
            JOptionPane.showConfirmDialog(null, "Dia libre");   
            break;
         case "Domingo":
            JOptionPane.showConfirmDialog(null, "Dia libre");   
            break;
        default:
            JOptionPane.showConfirmDialog(null, "El dia es erroneo es erroneo");   
    
        int horas;
           horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de horas que trabaja por semana "));
           int años;
           años = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de años que lleva trabajando "));
           if (años <= 9)
           años = JOptionPane.showConfirmDialog(null, "Su salario se queda igual");
           double salariocdhora;
           salariocdhora = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su salario por hora:"));
        double salariobruto = salariocdhora * 1.20;
          if (salariobruto >= 1000)
           JOptionPane.showConfirmDialog(null, salariobruto / 0.10 + " Este es su nuevo salario");   
          if(salariobruto >= 2000 )
              JOptionPane.showConfirmDialog(null, salariobruto / 0.15 + " Este es su nuevo salario");
    }
       }
    }
}
