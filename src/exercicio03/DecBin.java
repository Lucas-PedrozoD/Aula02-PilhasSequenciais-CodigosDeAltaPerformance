package exercicio03;

import java.util.Scanner;

public class DecBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorEmDecimal, cont = 0, duplicat;

        System.out.print("Valor em decimal: ");
        valorEmDecimal = sc.nextInt();
        duplicat = valorEmDecimal;

        while(duplicat != 0){
            duplicat /= 2;
            cont ++;
        }

        int [] resto = new int[cont];

        int j = cont - 1;
        while(valorEmDecimal != 0){
            resto[j] = valorEmDecimal % 2;
            valorEmDecimal /= 2;
            j--;
        }
        System.out.println("Valor em binario: ");
        for (int i = 0; i < resto.length; i++){
            System.out.print(resto[i]);
        }
    }
}
