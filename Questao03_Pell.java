import java.util.Scanner;

public class Questao03_Pell {

    private static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = lerN();

        int funcao = 0;
        funcao = preencherFuncao(funcao, n);

        imprimirFuncao(funcao);
    }
        
    public static void imprimirFuncao(int funcao) {
        System.out.println(funcao);
    }
        
    public static int preencherFuncao(int funcao, int n) {

        if (n == 0) {
            funcao = 0;
        } if (n == 1) {
            funcao = 1;
        } if (n > 2) {
            funcao = preencherFuncaoRec(funcao, n);
        }
            
        return funcao;
    }
                    
    public static int preencherFuncaoRec(int funcao, int n) {

        if (n < 3) {
            return funcao;
        } else {

            return preencherFuncaoRec(funcao + 2*funcao*(n-1) + funcao*(n-2), n-1);
        }
    }

    public static int lerN() {

        int k = 0;

        do {
            k = LER.nextInt();
        } while(k < 0);

        return k;
    }
}
