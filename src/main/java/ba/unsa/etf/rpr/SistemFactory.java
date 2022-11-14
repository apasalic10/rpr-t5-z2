package ba.unsa.etf.rpr;

public class SistemFactory {
    public Sistem dajSistem(String opis){
        if(opis == null) return null;
        else if(opis.equalsIgnoreCase("Android")){
            return new Android();
        }
        else{
            return new iOS();
        }
    }
}
