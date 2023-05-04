package lista3;

import java.util.Scanner;

public class ex1 {
	public static void main(String args[]) {
		
		Scanner input = new Scanner (System.in);
	

        int countAprovados = 0;
        int countReprovados = 0;
        int countFalta = 0;
        int countNotas = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;

        System.out.println("Digite a nota do aluno (-1 para encerrar): ");
        double nota = input.nextDouble();

        while (nota >= 0) {
            System.out.println("Digite o total de faltas do aluno: ");
            int faltas = input.nextInt();

            if (nota >= 90) {
                countAprovados++;
            } else if (nota < 70 || faltas >= 20) {
                countReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }

            somaNotas += nota;
            countNotas++;

            System.out.println("Digite a nota do aluno (-1 para encerrar): ");
            nota = input.nextDouble();
        }

        if (countNotas > 0) {
            double mediaNotas = somaNotas / countNotas;
            System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + countAprovados);
            System.out.println("Quantidade de alunos reprovados por nota ou falta: " + countReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Não foram informadas notas de alunos.");
        }
	
	}
}
