
/**
 * Test di Televisore
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0)
 */
public class Test
{
    public static void main (String[] args)
    {
        Televisore t, t1;
        
        t=new Televisore(32, "LED", "nero", "Samsung", 2000);
        t1=new Televisore(40, "OLED", "arancione", "Sony", 260);
        t.canaleSuccessivo();
        t.accendi();
        System.out.println(t.getColore());
        System.out.println(t.getCanale());
        System.out.println(t.aumentaVolume());
       
        System.out.println(t.toString());
        System.out.println(t1.toString());
    }
}
