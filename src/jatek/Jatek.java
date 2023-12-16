package jatek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jatek
{
    private Karakter[] karakterek;
    
    public Jatek()
    {
        karakterek = new Karakter[1];
        karakterek[0] = new Karakter();
    }
    
    public void elment()
    {
        try(ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("karakterek.bin")))
        {
            objKi.writeObject(karakterek);
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void betolt()
    {
        try(ObjectInputStream objBe = new ObjectInputStream(new FileInputStream("karakterek.bin")))
        {
            karakterek = (Karakter[])objBe.readObject();
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException | ClassNotFoundException ex)
        {
            Logger.getLogger(Jatek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
