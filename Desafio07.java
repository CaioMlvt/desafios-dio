import java.util.Arrays;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args){

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int segundoMaior = numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(null);
    System.out.println(segundoMaior);

     }
}
