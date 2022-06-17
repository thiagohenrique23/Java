public class CalculadoraProfessor {

  public static void main(String[] args) {
    // Constante do Pi
    float pi = 3.14f;

    // Raio
    float raio = 5.3f;

    // Area é igual ao raio ao quadrado multiplicado por Pi
    float area = raio * raio * pi;
    int areaSemCasasDecimais = (int) area;

    System.out.println("Resultado: " + area);
    System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);

  }
}
