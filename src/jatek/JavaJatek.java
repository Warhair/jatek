package jatek;

public class JavaJatek
{
    public static void main(String[] args)
    {
        run();
    }

    private static void run() {
       Karakter k1 = new Karakter();
        k1.felvesz(new Targy("arany","aranypenz"));
        k1.felvesz(new Targy("arany","aranypenz"));
        k1.felvesz(new Targy("arany","aranypenz"));
        k1.felvesz(new Targy("ezust","ezustpenz"));
        k1.felvesz(new Targy("ezust","ezustpenz"));
        k1.felvesz(new Targy("ezust","ezustpenz"));
        k1.felvesz(new Targy("ezust","ezustpenz"));
        k1.felvesz(new Targy("arany","aranypenz"));
        System.out.println(k1.toString());
        k1.hasznal("arany");
        System.out.println(k1.toString());
        k1.hasznal("ezust",  2);
        System.out.println(k1.toString());
        k1.hasznal("arany", 3, true);
        System.out.println(k1.toString());
        Jatek j1 = new Jatek();
        j1.betolt();
        j1.elment();
        
       
    }
}
