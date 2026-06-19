import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    System.out.println("--- Calculadora Inicializada ---");

    while (continuar) {
        System.out.println("\nEscolha a operação:");
        System.out.println("1. Somar (+)");
        System.out.println("2. Subtrair (-)");
        System.out.println("3. Multiplicar (*)");
        System.out.println("4. Dividir (/)");
        System.out.println("5. Sair");
        System.out.print("Opção: ");

        int opcao = scanner.nextInt();

        if (opcao == 5) {
            continuar = false;
            System.out.println("Até mais!");
            break;
        }

        if (opcao < 1 || opcao > 5) {
            System.out.println("Opção inválida!");
            continue;
        }

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        switch (opcao) {
            case 1 -> System.out.println("Resultado: " + (n1 + n2));
            case 2 -> System.out.println("Resultado: " + (n1 - n2));
            case 3 -> System.out.println("Resultado: " + (n1 * n2));
            case 4 -> {
                if (n2 == 0) {
                    System.out.println("Erro: Divisão por zero não permitida.");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
            }
        }
    }
    scanner.close();
}