
package jatek;




public class Start extends Helyszin{

    @Override
    public String leiras() {
       return "Ez a start! Haladj tovább!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }
    
}
