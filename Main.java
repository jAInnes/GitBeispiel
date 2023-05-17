
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
        Double ob = 50;
        Double summe = 0;

        Double obereGrenze = 20;
        for (int i = 1; i <= obereGrenze; ++i)

        {
            summe = summe + i;
        }
        
        Double mult = 1;

        for (int i = 2; i<=obereGrenze; ++i)

        {
            mult = mult * i;
        }
        System.out.println ("summe:" + summe + " Mult:" + mult);
    }
}
