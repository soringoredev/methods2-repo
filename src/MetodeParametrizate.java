public class MetodeParametrizate {
    public static void main(String[] args) {
        metodaFaraParametri();
        System.out.println(metodaCuParametri("Text"));
        System.out.println(metodaCuParametri2(224466,"Andrei"));
    }

    public static void metodaFaraParametri() {
        System.out.println("Republica Moldova");
    }

    public static String metodaCuParametri(String mesaj) {
        mesaj = "Ala bala portocala";
        return mesaj;
    }

    public static String metodaCuParametri2(int contact, String numeContact) {
        System.out.print(contact + " ");
        return numeContact;
    }


}
