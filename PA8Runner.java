
/**
 * Scrambles a given word.
 *
 * @author (Butovska)
 * @version (11/8/22)
 */

public class PA8Runner {

    public static String scrambleWord(String str) {
    
        if( str.length() == 0 || str.length() == 1 ) { //emty string or 1-char string
            return str; //returns a string w/o scrambling
        } else { //string is OK for scrambling
        
            for( int i = 0; i < str.length() - 1; i++  ) { //checks every position
    
                if( str.substring(i, i+1).equals("A")  &&
                    !str.substring(i+1, i+2).equals("A") ) {
        
                    str = str.substring(0,i) //positions in str before swapped positions
                        + str.substring(i+1, i+2) //position after "A"
                        + str.substring(i, i+1) //"A"
                        + str.substring(i+2); //positions in str after swapped positions
                
                    //two position have already been swapped
                    //so we go to the next two
                    i++;
                
                }
            
            }
        
        }
    
        return str; //returns a string after scrambling
    
    } //end of scrambleWord

    //tests scrambleWord
    public static void main(String args[]) {
        
        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("ABRACADABRA"));
        System.out.println(scrambleWord("WHOA"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("EGGS"));
        System.out.println(scrambleWord("A"));
        System.out.println(scrambleWord(""));
        System.out.println(scrambleWord("BEACHOWOOD"));
        System.out.println(scrambleWord("ALASKA"));
        System.out.println(scrambleWord("ALABAMA"));
        System.out.println(scrambleWord("ALAHAMBRA"));
        System.out.println(scrambleWord("LABAMBA"));
        System.out.println(scrambleWord("BANANA"));
        
        
    }  
        
}
