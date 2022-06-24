package com.pedroacbg.teste01;

/* 1) Observe o trecho de código abaixo:

int INDICE = 13, SOMA = 0, K = 0;

enquanto K < INDICE faça

{
    K = K + 1;
    SOMA = SOMA + K;
}

imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

RESPOSTA: O valor da variável SOMA será 91.

*/

public class Teste01 {

    public static void main(String[] args){

        int INDICE = 13, SOMA = 0, K = 0;

        while(K < INDICE){
            K += 1;
            SOMA += K;
        }

        System.out.println(SOMA);

    }


}
