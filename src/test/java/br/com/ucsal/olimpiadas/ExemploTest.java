package br.com.ucsal.olimpiadas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import br.com.ucsal.olimpiadas.domain.Participante;
import br.com.ucsal.olimpiadas.domain.Prova;

public class ExemploTest {

    @Test
    public void testeDominioParticipante() {
        Participante p = new Participante();
        p.setNome("Bianca");
        assertEquals("Bianca", p.getNome());
    }

    @Test
    public void testeDominioProva() {
        Prova pr = new Prova();
        pr.setTitulo("Futebol");
        assertEquals("Futebol", pr.getTitulo());
    }
}