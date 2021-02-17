package kiralynok;

import java.io.IOException;

public class Kiralynok {
    private Tabla tabla;

    public Kiralynok() {
        tabla = new Tabla('#');
    }
    
    
    
    public static void main(String[] args) throws IOException {
        new Kiralynok().Feladatok();
        
    }
    
    public void Feladatok(){
        Feladat4();
        Feladat6();
        Feladat9();
    }
    
    public Tabla Feladat4(){
        System.out.println("4. feladat: ures tabla letrehozasa");
        tabla.megjelenit();
        
        return tabla;
    }
    
    public void Feladat6(){
        System.out.println("6. feladat: feltoltott tabla:");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
    public void Feladat9(){
        System.out.println("9. feladat: ures sorok es oszlopok szama:");
        System.out.println("sorok szama: " + tabla.uresSorokSzama());
        System.out.println("oszlopok szama: " + tabla.uresOszlopokSzama());
    }
    
}
