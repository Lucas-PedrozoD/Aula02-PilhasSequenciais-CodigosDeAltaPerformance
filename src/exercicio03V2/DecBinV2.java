package exercicio03V2;

import pilhas.PilhaInt;

import java.util.Scanner;

public class DecBinV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        pilha.init();
        int valorDecimal, resto;
        System.out.println("Valor em decimal: ");
        valorDecimal = sc.nextInt();
        while (valorDecimal != 0){
            resto=valorDecimal%2;
            pilha.push(resto);
            valorDecimal /= 2;
        }

    }
}
