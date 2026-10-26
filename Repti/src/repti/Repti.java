package repti;

import java.util.Scanner;

public class Repti {

    public static void main(String[] args) {
        int i, ii, ff, f = 0;
        int par = 0;
        int aux = 0;

        Scanner captura = new Scanner(System.in);

        do{
        System.out.println("digite o valor inicial");
        ii = captura.nextInt();
        System.out.println("digite o valor final");
        ff = captura.nextInt();
        System.out.println("valor final tem que ser maior que o inicial");
        } while(ii > ff);
            
        
        for (i = ii; i <= ff; i++) {
            System.out.println(i);

            par = i % 2;
            if (par == 0) {
                aux++;
            };

            f = f + i;

        }
        par = par + aux;
        System.out.println("Soma de todos os numeros " + f);
        System.out.println("Quantidade de numeros pares " + par);
        }

 
}
