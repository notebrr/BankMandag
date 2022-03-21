package DomæneObjekter;

import java.io.IOException;
import java.util.concurrent.Executors;

public class Konto {
    private String navn;
    private String kode;
    private int saldo;

    public Konto(String navn, String kode, int saldo) {
        this.navn = navn;
        this.kode = kode;
        this.saldo = saldo;
    }

    public String getNavn() {
        return navn;
    }

    public String getKode() {
        return kode;
    }

    public int getSaldo() {
        return saldo;
    }

    public int indsæt(int i) {
        if(i > 0){
            saldo = saldo + i;
        }
        return saldo;
    }

    public int hæv(int i){
        if(saldo - i < 0){
            return saldo;
        }

        if(i > 0){
            saldo = saldo - i;
        }

        return saldo;
    }
}
