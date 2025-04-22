public class Operadores {

    // Soma dois números, simples assi
    public float adicao(float v1, float v2) {
        return v1 + v2;
    }


    // Faz a subtração do prieiro pelo segundo
    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    // Multiplica os dois valores
    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    // Faz a divisão mas dá uma olhada se o divisor não é zero (senão dá ruim)
    public float divisao(float v1, float v2) {
        if (v2 != 0) {
            return v1 / v2;
        } else {
            System.out.println("Eita! Não pode dividir por zero.");
            return 0;
        }

    }

    // Aqui é um teste com += ou -= dependendo do valor
    public int atribuicao(int valor) {
        if (valor < 10) {
            valor += 5; 
        } else {
            valor -= 2; 
        }
        return valor;
    }

    // Teste com operadores lógicos tipo AND e OR
    public String logico(boolean a, boolean b) {
        if (a && b) {
            return "Os dois são true.";
        } else if (a || b) {
            return "Só um é true.";
        } else {
         return "Nenhum é true.";
        }
    }
    // Compara dois números e fala qum é maior (ou se são iguais)
    public String comparar(int a, int b) {
        if (a > b) {
         return "O primeiro é maior.";
        } else if (a < b) {
            return "O segundo é maior.";
        } else {
            return "Iguaiszinhos.";
        }
 
    }
}

