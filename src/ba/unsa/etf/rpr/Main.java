package ba.unsa.etf.rpr;

class Sat {
    private int sati = 0,minute = 0,sekunde = 0;
    public Sat(int sati, int minute, int sekunde) { Postavi(sati,minute,sekunde); }
    public void Postavi(int sati, int minute, int sekunde) { this.sati = sati; this.minute = minute; this. sekunde=sekunde; }
    public void Sljedeci() {
        sekunde = sekunde+1;
        if (sekunde==60) { sekunde=0; minute = minute + 1; }
        if (minute==60) { minute=0; sati = sati + 1; }
        if (sati==24) sati=0;
    }
    void Prethodni() {
        sekunde = sekunde-1;
        if (sekunde==-1) { sekunde=59; minute = minute - 1; }
        if (minute==-1) { minute=59; sati = sati - 1; }
        if (sati==-1) sati=23;
    }
    void PomjeriZa(int pomak) {
        if (pomak>0) for (int i = 0; i<pomak; i = i + 1) Sljedeci();
		else for (int i = 0; i<-pomak; i = i + 1) Prethodni();
    }
    public int DajSate()  { return sati; }
    public int DajMinute()  { return minute; }
    public int DajSekunde()  { return sekunde; }
    public void Ispisi()  {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }
}

public class Main {
    public static void main(String[] arg) {
        Sat s = new Sat(15, 30, 45);
        s.Ispisi();
        s.Sljedeci();
        s.Ispisi();
        s.PomjeriZa(-48);
        s.Ispisi();
        s.Postavi(0, 0, 0);
        s.Ispisi();
    }
}

