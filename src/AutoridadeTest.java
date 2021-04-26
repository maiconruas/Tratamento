import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutoridadeTest {

    @Test
    public void testeInformal()
    {
        FormatadorNome fn = new Informal();
        Autoridade a = new Autoridade ("Maicon", "Ruas", fn);
        assertEquals(a.getTratamento(), "Maicon");
    }


    @Test
    public void testeRespeitoMasculino ()
    {
        FormatadorNome fn = new Respeitado(true, false);
        Autoridade a = new Autoridade ("Maicon", "Ruas", fn);
        assertEquals(a.getTratamento(), "Sr. Maicon Ruas");
    }

    @Test
    public void testeRespeitoFeminino ()
    {
        FormatadorNome fn = new Respeitado(false, true);
        Autoridade a = new Autoridade ("Maria", "Silva", fn);
        assertEquals(a.getTratamento(), "Sra. Maria Silva");
    }

    @Test
    public void testeComTitulo ()
    {
        FormatadorNome fn = new Titulo("Respeitado");
        Autoridade a = new Autoridade ("João", "Rosa", fn);
        assertEquals(a.getTratamento(), "Respeitado João Rosa");
    }

}