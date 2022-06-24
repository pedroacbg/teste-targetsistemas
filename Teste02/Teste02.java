/*
    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
    escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado
    pertence ou não a sequência.

    IMPORTANTE:

    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;
 */

import java.util.Scanner;

public class Teste02 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número para calcular a sequência de Fibonacci: ");
        int n = sc.nextInt();
        System.out.println();
        int aux[] = new int[n + 1];
        boolean contains = false;

        for(int i = 0; i <= n; i++){
            System.out.print(fib(i) + ", ");
            aux[i] = fib(i);
        }

        for(int i = 0; i < aux.length; i++){
            if(aux[i] == n){
                contains = true;
            }
        }

        System.out.println();
        if(contains){
            System.out.println("O número informado pertence a sequência!");
        }else {
            System.out.println("O número informado não pertence a sequência!");
        }
        sc.close();
    }

    static int fib(int n){
        return (n < 2) ? n : fib(n -1) + fib(n - 2);
    }

}
