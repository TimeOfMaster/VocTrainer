public class Vokabel{
    private String deutsch, informatik;
    private int richtigGenannt;
    private int falschGenannt;
    private int anzahlGeuebt;

    public Vokabel(String pInformatik, String pDeutsch){
        deutsch = pDeutsch;
        informatik = pInformatik;  
    }
    
    public String getInformatik(){
        return informatik;
    }
    
    public String getDeutsch(){
       return deutsch;
    }
    
    public void setRichtigGenannt(){
        richtigGenannt++;
        // Bei richtiger Vokabel werden die Fehlversuche auf 0 zur�ckgesetzt
        falschGenannt=0;
    }
    
    public int getRichtigGenannt(){
        return richtigGenannt;
    }
    
    public void setAnzahlGeuebt(){
        anzahlGeuebt++;
    }
    
    public int getAnzahlGeueb(){
        return anzahlGeuebt;
    }
    
    public int getFalschGenannt() {
        return falschGenannt;
    }
    
    public void setFalschGenannt() {
        falschGenannt++;
    }
}
