import java.util.*;

public class reto4 {
    public static void main(String[] args) {
       int [][]matriz=new int[9][9];
       Scanner myObj=new Scanner (System.in);
    System.out.println("Porfavor llene el sudoku de corrido");
        
       for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j]=myObj.nextInt(); 
            ;
        }
    }
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {

            System.out.print(" |"+matriz[i][j]+" __  " );
            
        }
        System.out.println(" "); // salto de línea después de cada fila


        
    }

   
    int sumas=matriz[0][0]+matriz[0][1]+matriz[0][2]+matriz[0][3]+matriz[0][4]+matriz[0][5]+matriz[0][6]+matriz[0][7]+matriz[0][8];
    int sumas2=matriz[1][0]+matriz[1][1]+matriz[1][2]+matriz[1][3]+matriz[1][4]+matriz[1][5]+matriz[1][6]+matriz[1][7]+matriz[1][8];
    int sumas3=matriz[2][0]+matriz[2][1]+matriz[2][2]+matriz[2][3]+matriz[2][4]+matriz[2][5]+matriz[2][6]+matriz[2][7]+matriz[2][8];
    int sumas4=matriz[3][0]+matriz[3][1]+matriz[3][2]+matriz[3][3]+matriz[3][4]+matriz[3][5]+matriz[3][6]+matriz[3][7]+matriz[3][8];
    int sumas5=matriz[4][0]+matriz[4][1]+matriz[4][2]+matriz[4][3]+matriz[4][4]+matriz[4][5]+matriz[4][6]+matriz[4][7]+matriz[4][8];
    int sumas6=matriz[5][0]+matriz[5][1]+matriz[5][2]+matriz[5][3]+matriz[5][4]+matriz[5][5]+matriz[5][6]+matriz[5][7]+matriz[5][8];
    int sumas7=matriz[6][0]+matriz[6][1]+matriz[6][2]+matriz[6][3]+matriz[6][4]+matriz[6][5]+matriz[6][6]+matriz[6][7]+matriz[6][8];
    int sumas8=matriz[7][0]+matriz[7][1]+matriz[7][2]+matriz[7][3]+matriz[7][4]+matriz[7][5]+matriz[7][6]+matriz[7][7]+matriz[7][8];
    int sumas9=matriz[8][0]+matriz[8][1]+matriz[8][2]+matriz[8][3]+matriz[8][4]+matriz[8][5]+matriz[8][6]+matriz[8][7]+matriz[8][8];

   

    if(sumas==45){
            if(sumas2==45){
                if(sumas3==45){
                    if(sumas4==45){
                        if(sumas5==45){
                            if(sumas6==45){
                                if(sumas7==45){
                                    if(sumas8==45){
                                        if(sumas9==45){


                                                System.out.println("FELICITACIONES USTED HIZO EL SUDOKU PERFECTO");

                                        }
                    else{ 
                System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
            }



                                    }
                else{ 
                System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
            }




                                }
                else{ 
                System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
            }






                            }
                else{ 
                System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
            }







                        }
                else{ 
                System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
            }









                    }
                        else{ 
                            System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
                        }
            
                    














                }







            else{ 
                System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
            }











            }
            else{ 
                System.out.println("LO LAMENTAMOS, EL SUDOKU QUEDO MAL");
            }







    }
    else{
        System.out.println("El sudoku quedo mal bien");
    }
    
}
}


    
 