/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica4_1;
import java.util.*;
/**
 *
 * @author Sandra
 */
public class Práctica4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner sc=new Scanner (System.in);
    System.out.println("Día:");
    int dia=sc.nextInt();
    System.out.println("Mes:");
    int mes=sc.nextInt();
    System.out.println("Año:");
    int año=sc.nextInt();
    
    dia=dia+1;//Aquí para que primero compruebe que está bien lo de antes
    
    //Aquí empiezan los días
    if (dia>=1 && dia<=31){//if del día
        if (mes>=1 && mes<=12){//if del mes
            if(mes==2){//if de febrero
                if (año%4==0 || año%100==0 || año%400==0){//if año bisiesto
                    if (dia==30){//if número erróneo en año bisiesto
                        mes=mes+1; 
                        dia=1;
                    }
                }
                else
                    if (dia==29){
                        mes=mes+1; 
                        dia=1;
                    }
                    else{ //else del if del número erróneo
                        if (dia==30 || dia==31)
                            System.out.println("Número erróneo de días");
                    }
            }
            if(mes==4 || mes==6 || mes==9 || mes==11 && dia==31){//if meses de 30 días
                mes=mes+1; 
                dia=1;
            }
            if(año>=0){//if del año
                
                if(dia==32){//Todo lo siguiente está dentro del if del año
                      dia=1;
                      mes++;
                      if(mes==13){
                          mes=1;
                          año++;
                       }
                }
               
               
                  System.out.println("Mañana será el día: " + dia);//Probar el fallo poniendo un System
                  System.out.println("Mañana será el mes: " + mes);
                  System.out.println("Mañana será el año: " + año); 
            }
            else{
                System.out.println("El año introducido es incorrecto");

            }
        }
        else{
           System.out.println("El mes introducido es incorrecto");

        }
    }
    else{
        System.out.println("El día introducido es incorrecto");
    }
    }
    }
    

    
    

