public class CalculoIMC {
    public static void main(String[] args) {
        double peso = 70;
        double altura = 1.75;
        double imc = calcularIMC(peso, altura);
        exibirResultado(imc);
    }
    public static double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
     } 
     public static void exibirResultado(double valor) {
        System.out.println("Seu IMC é: " + valor) {
        if (valor < 18.5)
            System.out.println("Classificação: Abaixo do peso");
       else if (valor < 25)
         System.out.println("Classificação: Peso normal");
         else
            System.out.println("Classificação: Sobrepeso ou obesidade");
     }
}
