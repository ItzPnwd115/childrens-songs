/**
 * This program sings the song "Ants Go Marching."
 * lyrics: http://www.kidspot.com.au/Baby-Baby-play-and-toys-The-ants-go-marching-lyrics+5210+425+article.htm
 *
 * @author  Sean Donlin
 * @version 8/28/2017
 */

public class AntsGoMarching 
{
    /**
     * Sings the first two lines.
     *
     * @param Number (as a word) for how the ants march
     */
    public static void goMarching(String number) 
    {
        System.out.println("The ants go marching " + number +" by " + number + ",");
        System.out.println("Hoorah!Hoorah!");
    }
    
    /**
     * Sings the third line.
     *
     * @param Number (as a word) for how the ants march
     */ 
    public static void noHurrah(String number)
    {
       System.out.print("The ants go marching " + number +" by " + number + ";");
    }
    
    /**
     * Sings the 4th line about the little ant.
     *
     * @param action What the little one stops to do
     */
   public static void littleAnt(String action)
    {   
        System.out.println("The little");
    }
    
    /**
     * Sings the last two lines of each verse.
     */ 
    public static void rain() 
    {

    }

    /**
     * Sings a verse of Ants Go Marching.
     * 
     * @param number Number (as a word) for how the ants march
     * @param action What the little one stops to do
     */
    public static void singIt(String n, String action) 
    {

        
    }

    /**
     * Calls the singIt() for each verse.
     */
    public static void main(String[] args) 
    {
        System.out.println("Ants Go Marching\n");
        
        singIt("one","suck his thumb");
    }
   
}