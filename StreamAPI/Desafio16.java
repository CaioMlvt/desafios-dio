import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args){

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> resultado = numeros.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> pares = resultado.get(true);
        List<Integer> impares = resultado.get(false);

     }
}
