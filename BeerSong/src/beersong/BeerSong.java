/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Binju
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    
    static String Ninety_Nine_Bottles_of_Beer(int i) { return i > 1 ? " bottles of beer" : " bottle of beer"; }
    
    public static void main(String [] arg) {
    String [] Ninety_Nine_Bottles_of_Beer = { " on the wall, ", "\nTake one down, pass it round, " };
    for(int i=99;i>0;i--) System.out.println("" + i + Ninety_Nine_Bottles_of_Beer(i) + Ninety_Nine_Bottles_of_Beer[0] + i + Ninety_Nine_Bottles_of_Beer(i) + Ninety_Nine_Bottles_of_Beer[1] + ((i>1)?i+Ninety_Nine_Bottles_of_Beer(i):"no more bottles of beer"));
  }
} 

