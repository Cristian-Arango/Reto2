public class reto3 {
    public static void main(String[] args) {
       String [][]matriz={{"Esc  ","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","Impr","Bloq Despl","Pausa Inter"," "," "," "," "},
       {"°","1!","2@","3#","4$","5%","6&","7/","8(","9)","0=","?","¿","←--"," ", "Inser","inicio","  ","Pag+"," "," ", "blognum","/","*","-"},
       {"←→","Q","W"  , " E", " R" ,  " T", " Y" , " U" , " I"  ," O" ,  "  P ","´^[","*+]","}"," SUPR"," INICIO"," ","Re Pag+"," "," ","7","","8","9","+"},
       {"Bloc may","A","S"," D","F"," G","H"," J","K"," L"," Ñ","{","  INTRO <--"," "," ","    ","               "," ","4","   5","6","+"},
       {"↑  SHIFT","  Z","X"," C","V"," B","N"," M",",;"," .:","-_","  ↑SHIFT", "            ↑","                        1","   2","3","INTRO"},
       {"CTRL","WINDOWS"," ----------------------","ALT GR","FN","LUCES","CTRL"," <-- ","   ↓","      -->","            0","  .", "     INTRO"     }

       


       };

        
       for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {

            System.out.print(matriz[i][j]+"   " );
            ;
        }
        System.out.println(" "); // salto de línea después de cada fila
    }
}
}
    
 