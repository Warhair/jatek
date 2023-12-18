
package jatek;


public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
        return "Ez a kezdő mező! Jobbra vagy balra";
    }

    @Override
    public Helyszin egyikIrany() {
       return new Balra();
    }

    @Override
    public String eggyikBfelirata() {
        return "balra";
    }
    
}
