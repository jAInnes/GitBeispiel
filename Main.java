
/**
 * Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Main
{
    public static void main (String args[])
    {
        int ob = 10;
        int summe = 0;
        for (int i = 1; i <= ob; ++i)
        {
            summe = summe + i;
        }
        
        int mult = 1;
        for (int i = 2; i<=ob; ++i)
        {
            mult = mult * i;
        }
        System.out.println ("summe:" + summe + " Mult:" + mult);
    }
}
