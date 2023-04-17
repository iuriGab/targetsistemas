import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //1)
        int indice = 13, k = 0, soma = 0;

        while (indice > k) {
            k += 1;
            soma = soma + k;
        }

        System.out.println(soma);

        //2)
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean pertence = PertenceFibonacci.pertenceFibonacci(number);
        if (pertence) {
            System.out.println(number + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }

        //3)
        //a-9
        //b-128
        //c-49
        //d-100
        //e-13
        //f-20

        //4)
        //Nenhum. Porque quando eles se cruzam a distância dos dois em relação a Ribeirão Preto e França
        //(independente de qual seja a cidade) é a mesma, pois quando se cruzam, estão no mesmo local.

        //5)
        Scanner sc2 = new Scanner(System.in);

        String string = sc2.nextLine();

        sc2.close();

        String stringInvertida = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }

        System.out.println(stringInvertida);
    }


}
