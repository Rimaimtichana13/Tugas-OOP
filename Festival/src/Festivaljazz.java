public class Festivaljazz extends Basefestival{
    public String Namaartisjazz;
    public String Genrejazz;

    public void Informasifestival() {
        System.out.println("Informasi Festival Jazz");
    }
    
@Override
    public void Carabelitiket() {
        System.out.println("Ada berapa artis");
        super.Carabelitiket();
    }
}
