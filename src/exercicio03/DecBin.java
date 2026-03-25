package exercicio03;

import java.util.Scanner;

public class DecBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorEmDecimal, resto;
        System.out.print("Valor em decimal: ");
        valorEmDecimal = sc.nextInt();

        System.out.println("Valor em binario: ");
        while(valorEmDecimal != 0){
            resto = valorEmDecimal % 2;
            valorEmDecimal /= 2;
            System.out.print(resto);
        }
    }
}
