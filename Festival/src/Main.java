public class Main {
    public static void main(String[] args) {
        System.out.println("Festival Pop");
        Festivalpop festival_01 = new Festivalpop();
        festival_01.Carabelitiket();
        festival_01.Informasifestival();

        System.out.println("Festival Jazz");
        Festivaljazz festival_02 = new Festivaljazz();
        festival_02.Carabelitiket();
        festival_02.Informasifestival();

        System.out.println("Festival Rock");
        Festivalrock festival_03 = new Festivalrock();
        festival_03.Carabelitiket();
        festival_03.Informasifestival();
    }
}