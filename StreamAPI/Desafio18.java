import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio18 {
    public static void main(String[] args){

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> repetidos = numeros.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1) .map(Map.Entry::getKey) .collect(Collectors.toList());
    System.out.println(repetidos);

     }
}
