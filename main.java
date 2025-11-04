import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main{

 public static void main(String[] args){


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);  

    // Desafio 1 - numeros.stream().sorted().forEach(System.out::println);

    // DESAFIO 2 - int soma = numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum);
    // System.out.println(soma);

   // DESAFIO 3 - numeros.stream().filter(n -> n > 0).forEach(System.out::println);

   // DESAFIO 4 - numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    // DESAFIO 5 - double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0.0);
    //System.out.println(media);

    // DESAFIO 6 - numeros.stream().filter(n -> n > 10).forEach(System.out::println);

    //DESAFIO 7 - int segundoMaior = numeros.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(null);
    //System.out.println(segundoMaior);

    //DESAFIO 8 - int soma = numeros.stream().reduce(0, Integer::sum);
    //System.out.println(soma);

    //DESAFIO 9 - numeros.stream().distinct().forEach(System.out::println);

    //DESAFIO 10 - List<Integer> resultado = numeros.stream().filter(n -> n % 2 != 0).filter(n -> n % 3 == 0 || n % 5 == 0).collect(Collectors.toList());
    //System.out.println(resultado);

    //DESAFIO 11 - int somaQuadrado = numeros.stream().map(n -> n * n).reduce(0, Integer::sum);
    //System.out.println(somaQuadrado);

    //DESAFIO 12 - int produto = numeros.stream().reduce(1, (a,b) -> a * b);
    //System.out.println(produto);

    //DESAFIO 13 - List<Integer> intervalo = numeros.stream().filter(n -> n > 0 && n <= 5).collect(Collectors.toList());

    //DESAFIO 14 - 17 - List<Integer> primos = numeros.stream().filter(n -> n > 1 && IntStream.range(2, (int)Math.sqrt(n) + 1).noneMatch(i -> n % i == 0)).distinct().collect(Collectors.toList());
    //System.out.println(primos);

    //DESAFIO 15 - numeros.stream().filter(n -> n < 0).forEach(System.out::println);

    //DESAFIO 16 - Map<Boolean, List<Integer>> resultado = numeros.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    //List<Integer> pares = resultado.get(true);
    //List<Integer> impares = resultado.get(false);

    //DESAFIO 18 - List<Integer> repetidos = numeros.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() > 1) .map(Map.Entry::getKey) .collect(Collectors.toList());
    //System.out.println(repetidos);

    //DESAFIO 19 - int soma35 = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0,Integer::sum);
    //System.out.println(soma35);



}
}

   
    



