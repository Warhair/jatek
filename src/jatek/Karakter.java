package jatek;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Karakter implements Serializable
{
    private final ArrayList<Targy> felszereles;
    
    private int eletero;
    private int ugyesseg;
    private int szerencse;
    
    private static final Random r = new Random();

    public Karakter()
    {
        felszereles = new ArrayList<>();
        eletero = d6(2) + 12;
        ugyesseg = d6() + 6;
        szerencse = d6() + 6;
    }

    public int getEletero()
    {
        return eletero;
    }

    public void setEletero(int eletero)
    {
        this.eletero = eletero;
    }

    public int getUgyesseg()
    {
        return ugyesseg;
    }

    public void setUgyesseg(int ugyesseg)
    {
        this.ugyesseg = ugyesseg;
    }

    public int getSzerencse()
    {
        return szerencse;
    }

    public void setSzerencse(int szerencse)
    {
        this.szerencse = szerencse;
    }
    
    public void felvesz(Targy t)
    {
        felvesz(t, 1);
    }
    
    public void felvesz(Targy t, int db)
    {
        for (int i = 0; i < db; i++)
        {
            felszereles.add(t);
        }
    }
    
    public void hasznal(String targyNev)
    {
        hasznal(targyNev, 1);
    }
    
    public void hasznal(String targyNev, int db)
    {
        hasznal(targyNev, db, false);
    }
    
    public void hasznal(String targyNev, int db, boolean mindenkeppHasznal)
    {
        int hanyIlyenNevuTargy = 0;
        for (Targy targy : felszereles)
        {
            if (targy.getNev().compareTo(targyNev) == 0)
            {
                hanyIlyenNevuTargy++;
            }
        }
        if (hanyIlyenNevuTargy > 0)
        {
            if (hanyIlyenNevuTargy >= db || mindenkeppHasznal)
            {
                int i = felszereles.size()-1;
                int hanyatHasznalt = 0;
                while (i >= 0 && hanyatHasznalt <= db)
                {
                    if (felszereles.get(i).getNev().compareTo(targyNev) == 0)
                    {
                        felszereles.remove(i--);
                        hanyatHasznalt++;
                    }
                    i--;
                }
                System.out.printf("Elhasznált tárgy(ak): %ddb %s\n", hanyatHasznalt, targyNev);
            }
            else
            {
                System.out.println("Nincs elég ilyen tárgy a felszerelésben!");
            }
        }
        else
        {
            System.out.println("Nincs ilyen tárgy a felszerelésben!");
        }
    }
    
    private static int d6()
    {
        return d6(1);
    }
    
    private static int d6(int n)
    {
        int eredmeny = 0;
        for (int i = 0; i < n; i++)
        {
            eredmeny = r.nextInt(6) + 1;
        }
        return eredmeny;
    }

    @Override
    public String toString() {
        return "Karakter{" + "felszereles=" + felszereles + ", eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
    }
    
}