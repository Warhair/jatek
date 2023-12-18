
package jatek;


public class Balra extends Helyszin{

    @Override
    public String leiras() {
        return "Ez balra van";
    }

    @Override
    public String eggyikBfelirata() {
        return  "Észak";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
