package DomæneObjekter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {
    Konto konto;

    @BeforeEach
    void setUp(){
        konto = new Konto("nik", "i", 100);
    }

    @Test
    void indsæt() {
        assertEquals(200, konto.indsæt(100));
    }

    @Test
    void indsætNegativ() {
        assertEquals(100, konto.indsæt(-100));
    }

    @Test
    void hævPenge() {
        assertEquals(100, konto.hæv(-200));
    }
}