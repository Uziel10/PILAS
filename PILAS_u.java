
package PILAS;
import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class PILAS_u {
    
    Scanner leer=new Scanner(System.in);
    public static PILAS_u metodo= new PILAS_u();
    
    char pila [] =new char [27];
    int Random[] = new int [27];
    int TOPE=0;
  
   
    
     public static void main(String[] args) {
         
         Scanner leer2=new Scanner(System.in);
         
         int OPC;
         do
         {
             
             System.out.print("\t\t<<MENU>>");
             System.out.print("\n1-MOSTRAR");
             System.out.print("\n2-ELIMINAR");
             System.out.print("\n3-AGREGAR");
             System.out.print("\n4-LLENAR");
             System.out.print("\n5-LLENAR ALEATORIAMENTE");
             System.out.print("\n6-ORDENAR");
             System.out.print("\n7-SALIR");
             
             System.out.print("\n\nSELECCIONA UNA OPCION:  ");
            
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
             
             case 5:
             metodo.Aleatorio();
             break;
             
             case 6:
             metodo.Ordenar();
             break;
         }
         
         }
         while(OPC!=7);
         
     
}
     public void Agregar()
     {
         if(TOPE<27)
         {
             System.out.print("INGRESA UN DATO:  ");
             pila[TOPE]=leer.next().charAt(0);  //A,B,C
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
         char [] U={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; //*ARREGLO 
         
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
                
     }
     
     public void Aleatorio()
     {    
         System.out.print("\nDATOS ALEATORIOS INGRESADOS CORRECTAMENTE....\n");
         System.out.print("\n***PILA DESORDENADA***\n");
     for(int x=TOPE; x<27; x++)
     {
         Random[x]=(int)(Math.random()*25+65);
         pila[TOPE]=(char)Random[x];
         TOPE++;
         System.out.print(pila[x]+" ");  
         
     }  
      System.out.print("\n\n");

     
    }
     
   public void Ordenar()       
   {
       char auxiliar;
        
       for(int u=0; u<TOPE; u++)
       {
           for(int j=0; j<TOPE-1; j++)
           {
               if(pila[j]>pila[j+1])
               {
                   auxiliar=pila[j];
                   pila[j]=pila[j+1];
                   pila[j+1]=auxiliar;
  
               }
           }
       }System.out.print("\n***PILA ORDENADA***\n");
      for(int u=0; u<TOPE; u++)
       {
       
         System.out.print(pila[u]+" ");  
      
   } 
      System.out.print("\n\n");

   }
}
        
     


     
     
     

  