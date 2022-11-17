package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Plano {
  private List<Socio> socios = new ArrayList<>();

  public void novoSocio(String nomeSocio, String nomeTime) {
    Time time = TimeFactory.getTime(nomeTime);
    Socio socio = new Socio(nomeSocio, time);
    socios.add(socio);
  }

  public List<String> getSocios() {
    List<String> saida = new ArrayList<String>();
    for (Socio socio : this.socios) {
      saida.add(socio.getInfoSocio());
    }
    return saida;
  }
}
