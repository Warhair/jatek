package jatek;

import java.util.UUID;

public class Targy
{
    private final String nev;
    private final String leiras;
    
    private final UUID id;

    public Targy(String nev, String leiras)
    {
        this.nev = nev;
        this.leiras = leiras;
    id = UUID.randomUUID();
    }

    public String getNev()
    {
        return nev;
    }

    public String getLeiras()
    {
        return leiras;
    }

    public UUID getId()
    {
        return id;
    }

    @Override public String toString()
    {
        return "id: " + id + "\n" + nev + ":\n" + leiras + "\n";
    }
}
