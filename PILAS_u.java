
package PILAS;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class PILAS_u {
    
    Scanner leer=new Scanner(System.in);
    String pila [] =new String [27];
    int TOPE=0;
    
     public static void main(String[] args) {
         
         Scanner leer2=new Scanner(System.in);
         PILAS_u metodo= new PILAS_u();
         int OPC;
         do
         {
             
             System.out.print("\t\t<<MENU>>");
             System.out.print("\n1-MOSTRAR");
             System.out.print("\n2-ELIMINAR");
             System.out.print("\n3-AGREGAR");
             System.out.print("\n4-LLENAR:  ");
             System.out.print("\n5-SALIR:  ");
             
             System.out.print("\nSELECCIONA UNA OPCION:  ");
            
         switch(OPC=leer2.nextInt())
         {
                 
             case 1:
             metodo.Mostrar();
             break;
                 
                 
             case 2:
             metodo.Eliminar();
             break;
             
             
             case 3:
             metodo.Agregar();
             break;
             
             
             case 4:
             metodo.Llenar();
             break;
         }
         
         }
         while(OPC!=5);
         
     
}
     public void Agregar()
     {
         if(TOPE<27)
         {
             System.out.print("INGRESA UN DATO:  ");
             pila[TOPE]=leer.nextLine();   //A,B,C
             TOPE++;
             
         }
         else
         {
             System.out.print("\n\nTU PILA ESTA LLENA...\n\n");
         }
     }
     public void Eliminar()
     {
         if(TOPE>0)
         {
             System.out.print("\n\nDATO ELIMINADO...\n\n");
             TOPE--;
         }
         else
         {
             System.out.print("\n\nNP PUEDO BORRAR PILA VACIA...\n\n");
         }
     }
     public void Mostrar()
     {
         if(TOPE>0)
         {
             System.out.print("\n\n");
         for(int i=TOPE-1; i>=0; i--)
         {
             System.out.print(pila[i]+" ");
         }
         System.out.print("\n\n");
         }
         else
         {
             System.out.print("\n\nPILA VACIA...\n\n");
         }
         
     }
     
     public void Llenar()
     {
         String [] U={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; //*ARREGLO 
         
         if(TOPE<27) //TOPE= 26,25,24,.....0
         {
             System.out.print("\n\n¡LISTO PILA RELLENADA!!\n\n");
          do
          {
             pila[TOPE]=U[TOPE];  //A,B,C...,D,E,F
             TOPE++;
             
          }
          while(TOPE<27);   //TOPE=3,4,5,6,7,....,27    28>TOPE
             
         }
         else
         {
             
         }
         
                
     }

    
     }


     
     
     

  