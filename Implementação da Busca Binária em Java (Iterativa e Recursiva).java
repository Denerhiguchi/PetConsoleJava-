class BuscaBinaria { // Removido "public"
    public static int buscaBinaria(int[] lista, int valor) {
        int inicio = 0;
        int fim = lista.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (lista[meio] == valor) {
                return meio;
            } else if (lista[meio] < valor) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}

public class Main { // Agora a classe principal é Main
    public static void main(String[] args) {
        int[] arquivoOrdenado = {2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18, 19, 20, 21, 22, 23, 28, 29, 30, 31, 35,
                                  36, 37, 39, 41, 47, 50};

        int valor = 19;

        int indice = BuscaBinaria.buscaBinaria(arquivoOrdenado, valor);
        if (indice != -1) {
            System.out.println("Valor " + valor + " encontrado no índice " + indice + ".");
        } else {
            System.out.println("Valor " + valor + " não encontrado.");
        }
    }
}
