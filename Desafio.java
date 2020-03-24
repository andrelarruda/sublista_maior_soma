import java.util.Arrays;

public class Desafio {
   /**
    * Desafio para a vaga de estágio do CIEE - 17/03/20
    */
	// Dado um array de inteiros [...], ache o intervalo contendo a maior soma de elementos consecutivos.

	public static void main(String[] args) {
      int numbers[] = { -12, 6, -7, -8, 1, -10, 13, -14, -5, 9, 12, 19, -17, 19, 0, -15, 17, -12, -4, -4 };
   
      printInterval(numbers, numbers.length);

	}

	public static void printInterval(int[] lista, int tamanho){
      int max_ate_agora = -tamanho - 1;
      int max_terminando_aqui = 0;
      int inicio = 0;
      int termino = 0;
      int soma = 0;

      for (int i = 0; i < tamanho; i++) {
         max_terminando_aqui += lista[i];

         if (max_ate_agora < max_terminando_aqui){
            max_ate_agora = max_terminando_aqui;
            inicio = soma;
            termino = i;
         }

         if (max_terminando_aqui < 0){
            max_terminando_aqui = 0;
            soma = i + 1;
         }
      }
      System.out.printf("Índice de início: %d\n", inicio);
      System.out.printf("Índice de término: %d\n", termino);
      // to print the result subArray uncomment code below:
      // for (int i : Arrays.copyOfRange(lista, inicio, termino+1)){
      //    System.out.print(i + " ");
      // }

	}

}