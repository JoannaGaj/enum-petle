package EnumExample;

public class EnumApp {
    public static void main(String[] args) {
        Country country = Country.PL;
        System.out.println("To jest mój kraj Pl");
        System.out.println("To jest mój kraj Poland");
        System.out.println("To jest mój kraj " + Country.DE.getFullname());
        System.out.println("Mieszkam w " + country.getFullname());
        Country country2 = Country.DE;
        System.out.println("A ja mieszkam w " + country2);
    }
}
