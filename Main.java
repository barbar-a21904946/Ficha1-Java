import java.util.Arrays;

public class Main {

    static long soma(int num1, int num2) {

        return (long) num1 + num2;
    }

    static long soma(int num1, int num2, int num3) {
        return (long) num1 + num2 + num3;
    }

    static String concatena(int num1, int num2) {
        String concatena = "" + num1 + " " + num2;
        return concatena;
    }

    static int[] criaArray() {
        int[] array = new int[5];
        return array;
    }

    static void preencheArray(int[] numeros) {
        numeros[0] = 4;
        numeros[1] = 9;
        numeros[2] = 9;
        numeros[3] = 7;


    }

    static String converteParaString(int[] numeros) {

        return Arrays.toString(numeros);
    }

    static long soma(int[] numeros) {
        if (numeros == null) {
            return 0;
        } else {
            int soma = 0;
            for (int i = 0; i < numeros.length; i++) {
                soma += numeros[i];
            }
            return soma;
        }

    }

    static long maior(int[] numeros) {


        if (numeros == null) {
            return 0;
        } else {
            int maior = Integer.MIN_VALUE;
            int indice1 = -1;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                    indice1 = i;

                }
            }
            return maior;
        }


    }

    public static void main(String[] args) {
        
    }


}
