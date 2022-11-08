public class Vokabeltrainer{
    private List <Vokabel> vokabelliste;
    private int laengeListe;
    private int laengeUebung; // Anzahl der zu �berpr�fenden Vokabeln
    private int anzahl; // Nummer der aktuell abgefragten Vokabel
    private int anzahlRichtig;
    private int anzahlFalsch;
    public Vokabeltrainer(){
        vokabelliste = new List<Vokabel>();
        laengeListe = 0;
        laengeUebung = 0;
        anzahl = 0;
        anzahlRichtig = 0;
        anzahlFalsch = 0;
        neueVokabelHinzufuegen("class","Klasse");
        neueVokabelHinzufuegen("private","Attribute haben die Sichtbarkeit");
        neueVokabelHinzufuegen("int","ganze Zahlen sind der Datentyp");
    }

    public void neueVokabelHinzufuegen(String informatik, String deutsch){
        vokabelliste.append(new Vokabel(informatik, deutsch));
        laengeListe++;
    }
    
    public String vokabelAbfragen(){
        vokabelliste.toFirst();
        return vokabelliste.getContent().getInformatik();
    }
    
    public String alleAusgeben(){
        String alle = "";
        vokabelliste.toFirst();
        while(vokabelliste.hasAccess()){
            alle = alle +vokabelliste.getContent().getDeutsch()+":"+vokabelliste.getContent().getInformatik()+"\n";
            vokabelliste.next();
        }
        return alle;
    }
}
