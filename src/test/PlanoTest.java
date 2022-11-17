package test;

import flyweight.Plano;
import flyweight.TimeFactory;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlanoTest {
  @Test
  void deveRetornarSocios() {
    Plano plano = new Plano();
    plano.novoSocio("Pedro Bonorino", "Botafogo");
    plano.novoSocio("Maria Bonorino", "Botafogo");
    plano.novoSocio("Carlos Bonorino", "Botafogo");
    plano.novoSocio("Rosina Bonorino", "Vasco");

    List<String> saida = Arrays.asList(
            "Socio{nome= 'Pedro Bonorino', time do coração= 'Botafogo'}",
            "Socio{nome= 'Maria Bonorino', time do coração= 'Botafogo'}",
            "Socio{nome= 'Carlos Bonorino', time do coração= 'Botafogo'}",
            "Socio{nome= 'Rosina Bonorino', time do coração= 'Vasco'}");

    assertEquals(saida, plano.getSocios());
  }

  @Test
  void deveRetornarTotalTimes() {
    Plano plano = new Plano();
    plano.novoSocio("Pedro Bonorino", "Botafogo");
    plano.novoSocio("Maria Bonorino", "Botafogo");
    plano.novoSocio("Carlos Bonorino", "Fluminense");
    plano.novoSocio("Rosina Bonorino", "Vasco");

    assertEquals(3, TimeFactory.getTotalTimes());
  }
}