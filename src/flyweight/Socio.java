package flyweight;

public class Socio {
  private String nome;
  private Time timeCoracao;

  public Socio(String nome, Time time) {
    this.nome = nome;
    this.timeCoracao = time;
  }

  public String getInfoSocio() {
    return "Socio{" +
            "nome= '" + this.nome + '\'' +
            ", time do coração= '" + timeCoracao.getNome()+ "'" + '}';
  }
}
