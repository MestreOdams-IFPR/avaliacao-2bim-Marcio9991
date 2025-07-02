import java.util.Scanner;

public class MarcioAndrez_TesteDaForca {

    private static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        while (LER.hasNext()) {
            int n = lerN();
            int k = lerK(n);

            int[] vetCandidatos = new int[n];
            vetCandidatos = lerCandidatos(vetCandidatos);
            vetCandidatos = ordenarVetor(vetCandidatos);

            int poderMinimo = 0;
            poderMinimo = qtdaPoderMinimo(vetCandidatos, k, n);

            imprimirPoderMinimo(poderMinimo);
        }
    }
                                    
    public static void imprimirPoderMinimo(int poderMinimo) {
        System.out.println(poderMinimo);
    }
            
    public static int qtdaPoderMinimo(int[] vetCandidatos, int k, int n) {

        int min = 0;

        for (int i = n; i > 0; --i) {
            if (k > 0) {
                min += vetCandidatos[i];
                k--;
            }
        }

        return min;
    }
            
    public static int[] ordenarVetor(int[] vetCandidatos) {
        int t = 0;

        for (int i = 0; i < vetCandidatos.length; i++) {
            for (int j = 0; j < vetCandidatos.length; j++) {
                if (vetCandidatos[i] > vetCandidatos[j])
                t = vetCandidatos[i];
                vetCandidatos[i] = vetCandidatos[j];
                vetCandidatos[j] = vetCandidatos[i];
            }
        }

        return vetCandidatos;
    }
            
    public static int[] lerCandidatos(int[] vetCandidatos) {

        for (int i = 0; i < vetCandidatos.length; i++) {
            do {
                vetCandidatos[i] = LER.nextInt();
            } while(vetCandidatos[i] < 0);
        }

        return vetCandidatos;
    }
            
    public static int lerK(int n) {
        int q = 0;

        do {
            q = LER.nextInt();
        } while(q < 1 || q > n);

        return q;
    }

    public static int lerN() {
        int q = 0;

        do {
            q = LER.nextInt();
        } while(q < 1 || q > Math.pow(10, 6));

        return q;
    }
}
