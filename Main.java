public class Main {

    public static void main(String[] args) {
        Employee Kamil = new Employee();
        Employee2 Judyta = new Employee2();
        suma Suma=new suma();

        System.out.println(Kamil.getImie()+ "  "+Kamil.getWiek()+" lat, wyplata: "+ Kamil.getWyplata() );
        System.out.println(Judyta.getImie()+ "  "+ Judyta.getWiek()+ " lat, wyplata: "+ Judyta.getWyplata());
        System.out.println("Suma wyplat: "+ Suma.sumaWyplat(Kamil.getWyplata(), Judyta.getWyplata()) );



    }
}
