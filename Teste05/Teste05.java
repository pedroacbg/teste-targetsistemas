/*
    5) Escreva um programa que inverta os caracteres de um string.

    IMPORTANTE:

    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

    b) Evite usar funções prontas, como, por exemplo, reverse;

 */


import java.util.Scanner;

public class Teste05 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma string para inverter seus caracteres: ");
        String n = sc.nextLine();

        System.out.print("String reversa: ");
        int i = n.length();

        while(i > 0){
            System.out.print(n.charAt(i - 1));
            i--;
        }

        sc.close();
    }

}
