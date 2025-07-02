import java.util.Scanner;

public class MarcioAndrez_ConselhoJedi {

    private static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int n = lerN();
        int k = lerK();
    }

    public static int lerK() {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'lerK'");
    }

    public static int lerN() {
        int q = 0;

        do {
            q = LER.nextInt();
        } while(q < 0 || q > Math.pow(10, 6));

        return q;
    }
}
