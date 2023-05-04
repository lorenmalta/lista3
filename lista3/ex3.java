package lista3;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal, pessoasTotal = 0;
        int[] pessoasCanal = new int[5];
        double[] percentualCanal = new double[5];

        System.out.println("Digite o número do canal (2, 4, 5, 7 ou 12) e o número de pessoas assistindo (digite 0 para eviar ou -1 para cancelar): ");

        do {
            canal = input.nextInt();

            if (canal != 0) {
                int pessoas = input.nextInt();

                pessoasCanal[canal/2 - 1] += pessoas;
                pessoasTotal += pessoas;
            }
        } while (canal != 0);

        if (pessoasTotal == 0) {
            System.out.println("Nenhum dado foi inserido.");
        } else {
            for (int i = 0; i < 5; i++) {
                percentualCanal[i] = (double) pessoasCanal[i] / pessoasTotal * 100;
                System.out.printf("Canal %d: %.2f%% de audiência\n", (i+1)*2, percentualCanal[i]);
            }
        }

        System.out.println("Programa encerrado.");
    }
}
