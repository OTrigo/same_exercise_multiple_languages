import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(String.format("Salario:"));
        float salario = scanner.nextFloat();
        System.out.println(String.format("Beneficios:"));
        float beneficios = scanner.nextFloat();
        System.out.println(String.format("Imposto:"));
        float imposto = scanner.nextFloat();
        scanner.close();

        if(salario >= 0 && salario <= 1100){
            imposto = 0.05F * salario;
        }else if(salario >= 1100.01 && salario <= 2500.00){
            imposto = 0.10F * salario;
        }else{
            imposto = 0.15F * salario;
        }

        float saida = salario - imposto + beneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
