/**
 * Televisore
 * 
 * @author (Leonardo Cannarella) 
 * @version (1.0)
 */
public class Televisore
{
    // Attributi caratteristiche
    private int pollici;
    private String schermo;
    private String colore;
    private String modello;
    private int frequenza;
    
    
    //Attributi stato
    private int canale;
    private int volume;
    private int luminosita;
    private boolean acceso;
    
    //Costruttore: Impostazioni predefinite
    public Televisore(int pollici, String schermo, String colore, String marca, int frequenza)
    {
        setPollici(pollici);
        setSchermo(schermo);
        setColore(colore);
        setModello(modello);
        setFrequenza(frequenza);
        canale=1;
        volume=10;
        luminosita=40;
        acceso=false;
    }
    
    // Get() e Set()
    public int getPollici()
    {
        return pollici;
    }
    
    private void setFrequenza(int f)
    {
        frequenza=f;
    }
    
    private void setPollici(int p)
    {
        pollici=p;
    }
    
    public int getFrequenza()
    {
        return frequenza;
    }
    
    private void setModello(String m)
    {
        modello=m;
    }
    
    public String getColore()
    {
        return colore;
    }
    
    private void setColore(String c)
    {
        colore=c;
    }
    
    public String getModello()
    {
        return modello;
    }
    
    public String getSchermo()
    {
        return schermo;
    }
    
    private void setSchermo(String s)
    {
        schermo=s;
    }
    
    public int getCanale()
    {
        return canale;
    }
    
    public int getVolume()
    {
        return volume;
    }
    
    public int getLuminosita()
    {
        return luminosita;
    }
    
    public boolean isAcceso()
    {
        return acceso;
    }
    
    public void setCanale(int c)
    {
        if(c>0&&c<99)
            canale=c;
    }
    
    //Operazioni
    public void accendi()
    {
        acceso=true;
    }
    
    public String accensione()
    {
        if(isAcceso()==true)
        {
            return "acceso";
        }
        else
        {
            return "spento";
        }
    }
    
    public void spegni()
    {
        acceso=false;
    }
    
    public String canaleSuccessivo()
    {
        if(isAcceso()==true)
        {   
            if(canale<99)
            {
                canale++;
            }
            
            else if(canale==99)
            {
                canale=1;
            }
            return "Canale successivo eseguito con successo";
        }
        else
            return "Canale successivo non eseguito perchè il televisore è spento";
    }
    
    public String canalePrecedente()
    {
        if(isAcceso()==true)
        {   
            if(canale>0)
                canale--;
                
            else if(canale==0)
            {
                canale=99;
            }
            return "Canale precedente eseguito con successo";
        }
        else
            return "Canale precedente non eseguito perchè il televisore è spento";
    }
    
    public String aumentaVolume()
    {
        if(isAcceso()==true)
        {   
            if(volume<50)
                volume++;
            
            return "Volume alzato con successo";
        }
        else
            return "Volume non alzato con successo perchè il televisore è spento";
    }
    
    public String diminuisciVolume()
    {
        if(isAcceso()==true)
        {   
            if(volume>0)
                volume--;
            
            return "Volume abbassato con successo";
        }
        else
            return "Volume non abbassato con successo perchè il televisore è spento";
    }
    
    public String aumentaLuminosita()
    {
        if(isAcceso()==true)
        {   
            if(luminosita<80)
                luminosita++;
            
            return "Luminosità alzata con successo";
        }
        else
            return "Luminosità non alzata con successo perchè il televisore è spento";
    }
    
    public String diminuisciLuminosita()
    {
        if(isAcceso()==true)
        {   
            if(luminosita>0)
                luminosita--;
            
            return "Luminosità abbassata con successo";
        }
        else
            return "Luminosità non abbassata con successo perchè il televisore è spento";
    }
    
    public String toString()
    {
        return "TELEVISORE\n" + "\n" + "Modello: " + getModello() + "\n" + "Schermo: " + getSchermo() + "\n" + "Colore: " + getColore() + "\n" + "Pollici: " + getPollici() + "\n" + 
        "STATO TELEVISORE:\n" + "Il televisore è " + accensione() + "\n" + "Volume: " + getVolume() + "\n" + "Luminosità: " + getLuminosita() + "\n" + "Canale: " + getCanale();
    }
}
