package PILAS;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class PILAS_2 {
    
     public static PILAS_2 Llamar = new PILAS_2();
    public int u;

    public static void main(String[] args)
    {
    
    int Tamaño=0;
    int O;
   
        Scanner leer = new Scanner(System.in);
        
        System.out.print("INGRESA EL TAMAÑO DE TUS PILAS:  ");
        Tamaño=leer.nextInt();
        
        
         
         int pila1[] = new int[Tamaño];
         int pila2[] = new int[Tamaño];
          int pila3[] = new int[Tamaño];
         
         
        
        do
      {
      System.out.print("\n\n\tMENU\n");
      System.out.print("\n1-LLENAR PILAS A Y B");
      System.out.print("\n2-MOSTRAR PILAS A Y B");
      System.out.print("\n3-VACIAL PILAS A Y B");
      System.out.print("\n4-UNIR PILAS");    
      System.out.print("\n5-MOSTRAR PILA C");
      System.out.print("\n6-SALIR");
      System.out.print("\n\nELIJE UNAOPCION:  ");
      
      O=leer.nextInt();
      
      
      
      switch(O)
      {
          case 1:
              Llamar.LlenarPilas(Tamaño, pila1, pila2);
              break;
              
          case 2:
              Llamar.MostrarPilas(pila1, pila2,Tamaño);
              break;
              
          case 3:
              Llamar.VaciarPilas(Tamaño, pila1);
              break;
              
          case 4:
              Llamar.UnirPilas(pila1, pila2, pila3, Tamaño);
              break;
              
          case 5:
              Llamar.MostrarPilaC(pila3, Tamaño);
              break;    
      }
      
      }
      while(O!=6);
    }
      
    
    
    public void LlenarPilas(int Tamaño,int []pila1, int []pila2)    
{   
   if(Tamaño!=0)
   {
    System.out.print("\n\nPILAS A Y B LLENADAS CORRECTAMENTE...\n\n");
    
    //LLENADO PILA NUMERO 1    
    for(int i=0;i<=Tamaño-1; i++)
    {
        pila1[i]=(int)(Math.random()*99+1);
    }

    //LLENADO PILA NUEMRO 2
   
    for(int j=0; j<Tamaño; j++)
    {
        pila2[j]=(int)(Math.random()*100+100);
    }
   }
   
   else
   {
       System.out.print("HUMANO TU PILA ...");
   }
    
}
    public void MostrarPilas(int []pila1, int []pila2,int Tamaño)
    { 
        
        if(Tamaño!=0)
        {
        //MOSTRANDO PILA A
 
       System.out.print("\n\n"); 
        System.out.print("PILA A:  ");
        for(int i=0; i<Tamaño; i++)
        {
            
             System.out.print(pila1[i]+"  ");
        }

        System.out.print("\n\n");

        //MOSTRANDO PILA B
        
        
        System.out.print("PILA B:  ");
        for(int j=0; j<Tamaño; j++)
        {
            
            System.out.print(pila2[j]+"  ");
        }
        
        System.out.print("\n\n"); 
      
    }
        
        else
    {
        System.out.print("\n\nNO PUEDO MOSTRAR PILAS VACIAS HUMANO...");
    }
    }
   
    public void VaciarPilas(int Tamaño,int []pila1)        
    {
        
      do
      {
          Tamaño--;
          
      }while(Tamaño<=0);
    }

    
    
    public void UnirPilas(int []pila1, int []pila2, int []pila3 , int Tamaño)
    {
     if(Tamaño!=0)
     {

       System.out.print("\n\nPILAS A Y B UNIDAS CORRECTAMENTE...\n\n");
        
        //UNIENDO PILAS A + B
        for(int u=0; u<Tamaño; u++)
        {
            pila3[u]=pila1[u]+pila2[u];
                   
        
        }
     }
     else
     {
         System.out.print("NO PUEDO UNIR PILAS VACIAS HUMANO...");
     }
        
       
        
    }
    
    public void MostrarPilaC(int []pila3, int Tamaño)
    {

        if(Tamaño!=0)
        {
        //UNIENDO PILAS A + B
        System.out.print("\nPILA C:  ");
        for(int u=0; u<Tamaño; u++)
        {
            System.out.print(+pila3[u]+"  ");
        
        }
        System.out.print("\n");
        }
        
        else
        {
            System.out.print("TUS PILAS A Y B ESTAN VACIAS POR LO TANTO NO PUEDO MOSTRAR TU PILA C...");
        }

        
    }
    
  
}
    





