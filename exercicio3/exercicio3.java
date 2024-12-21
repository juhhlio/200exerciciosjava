/*Crie um programa que declare e inicialize variáveis de todos os tipos
primitivos em Java (int, double, char, boolean, etc.). Exiba o valor de cada
variável no console.*/

package atividadesebook200.exercicio3;

import java.util.Locale;

public class exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int idade = 25;
        long maximo = 842356745;
        short medio = 9999;
        byte pequeno = 127;
        double salario = 2327.0;
        char sexo = 'M';
        String nome = "Julio Cesar";
        boolean estado = true;

        System.out.println("int = " + idade);
        System.out.println("long = " + maximo);
        System.out.println("short = " + medio);
        System.out.println("byte = " + pequeno);
        System.out.println("double = " + salario);
        System.out.println("char = " + sexo);
        System.out.println("nome = " + nome);
        System.out.println("boolean = " + estado);

    }
}
