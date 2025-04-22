public class Calculadora {

    public static void main(String[] args) {
        Operadores op = new Operadores(); // criando o objeto Operadores

        // Testando as contas básicas
        System.out.println("Soma: " + op.adicao(10, 5));
        System.out.println("Subtração: " + op.subtracao(10, 5));
        System.out.println("Multiplicação: " + op.multiplicacao(10, 5));
        System.out.println("Divisão: " + op.divisao(10, 0)); // testando divisão por zero só pra ver

        // Teste com += ou -=
        System.out.println("Atribuição com if: " + op.atribuicao(8));

        // Testando lógica com true/false
        System.out.println("Resultado lógico: " + op.logico(true, false));

        // Comparando dois valores
        System.out.println("Comparação: " + op.comparar(10, 10));
    }
}
