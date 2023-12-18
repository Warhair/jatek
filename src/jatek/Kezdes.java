
package jatek;


public class Kezdes extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez a kezdő mező! Jobbra vagy balra";
    }

    @Override
    public Helyszin egyikIrany() {
       return new Jobra();
    }

    @Override
    public String eggyikBfelirata() {
        return "jobra";
    }

    @Override
    public String masikBfelirata() {
        return "balra";
            }

    @Override
    public Helyszin masikIrany() {
        return new Balra();
    }
    
}
