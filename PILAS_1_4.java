package PILAS;

import java.util.Scanner;

/**
 *
 * @author Uziel
 */
public class PILAS_1_4 {
    
    public static int pilaU [] = new int [27];
    public static char pilaJ [] =new char [27];
    public static int TOPE=1;
    public static int i=0;
    public static char L;
    public static int V=0;
    
   public static int Opcion;
   public static PILAS_1_4 llamar= new PILAS_1_4();
   
   
   
    
    public static Scanner leer= new Scanner(System.in);
    public static Scanner leer2=new Scanner(System.in);
    
     public static void main(String[] args)
     {
         
          
          
           do
       {
       System.out.print("\n\nMENU\n\n");
       
       System.out.print("\n1-LLENAR");
       System.out.print("\n2-MOSTRAR");
       System.out.print("\n3-AGREFGAR");
       System.out.print("\n4-ELIMINAR");
       System.out.print("\n5-ORDENAR");
       
       System.out.print("\n\nESCOGE UNA OPCION:  ");
       
       
       switch(Opcion=leer.nextInt())
       {
           case 1:
            llamar.LLENAR();
            break;
            
           case 2:
              llamar.MOSTRAR();
              break;
               
           case 3:
           llamar.AGREGAR();
           break;
           
           case 4:
           llamar.ELIMINAR();
           break;
               
           case 5:
            llamar.ORDENAR();
            break;
       }
     
       }
            while(Opcion!=6);
           }

           

           
     public void LLENAR()
     {
           
         if(TOPE<27) 
         {
         
         for(i=TOPE; i<27; i++){                        /*0,  1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 13, 14,  15, 16,17,18, 19, 20, 21, 22, 23, 24, 25, 26*/
                                                     /*A  ,B  ,C  ,D  ,E  ,F  ,G  ,H  ,I  ,J  ,K  ,L  ,M  ,N  ,O  ,P  ,Q  ,R  ,S  ,T  ,U  ,V  ,W  ,X  ,Y  ,Z */
             pilaU[i]=(int)(Math.random()*26+65);    /*1,  2,  3,  4,  5,  6,  7,  8,  9,  10, 11, 12, 13, 14,  15, 16,17,18, 19, 20, 21, 22, 23, 24, 25, 26*/
             for(int j=TOPE; j<i; j++){
                 if(pilaU[i]==pilaU[j])
                 {                                     /*i=1,2,3,4,5,6,7,8,9 entonces j=1,2,3,4,5,6,7,8*/
                                           
                     i--;        
                 }
             }
             
             }  
         System.out.print("\n\nARREGLO EN DESORDEN...\n");
         for(int z=TOPE; z<27; z++){
         pilaJ[TOPE]= (char) pilaU[z];
         TOPE++;
         System.out.print(pilaJ[z]+" ");
         }
         }
         else
         {
             System.out.print("\n\nTU PILA YA ESTA LLENA HUMANO...\n");
         }
  
     }
     
     public void ORDENAR()
     {
         
      char  auxiliar;
        
       for(int u=1; u<TOPE; u++)
       {
           for(int e=1; e<TOPE-1; e++)
           {
               if(pilaJ[e]>pilaJ[e+1])
               {
                   auxiliar=pilaJ[e];
                   pilaJ[e]=pilaJ[e+1];
                   pilaJ[e+1]=auxiliar;
  
               }
           }
       }
       System.out.print("\n\nARREGLO EN ORDEN...\n");
       for(int z=1; z<27; z++){
         TOPE++;
         System.out.print(pilaJ[z]+" ");
         }
     }
     
     
     public void MOSTRAR()
     {
         if(TOPE==0)
         {
              System.out.print("\n\nNO PUEDO MOSTRA UNA PILA VACIA HUMANO...\n");
         }
        
         else
         {
             System.out.print("\n\nMOSTRADO ARREGLO...\n");
            for(int z=TOPE-1; z>=0; z--)
            {       
         System.out.print(pilaJ[z]+" ");
         }
            
         }
         
     }
     
     public void AGREGAR()
     {
     
        
         
         
      if(TOPE<27)
         {
             System.out.print("INGRESA UN DATO:  ");
             L= leer.next().charAt(0);
             
             for(int x=0; x<=TOPE; x++)
             {
                V=0;
             if(L==pilaJ[x])
             {
                System.err.print("\n\n¡ERROR! DATO REPETIDO...\n");
                 x=TOPE+1;
                 V=1;
             }
             
             }
             
             if(V==0)
             {
                 pilaJ[TOPE]=L;
                 TOPE++;
                 System.out.print("\n\nDATO AGREGADO...\n");
             }
         }
         else
         {
             System.out.print("\n\nTU PILA ESTA LLENA...\n\n");
         }
     }
     
     public void ELIMINAR()
     {
         
         if(TOPE>0)
         {
              TOPE--;
             System.out.print("\n\nDATO ELIMINADO...\n\n");
            
         }
         else
         {
             System.out.print("\n\nNO PUEDO BORRAR PILA VACIA...\n\n");
         }
         
}
}
             
     
     
     

     
