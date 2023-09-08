import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // Criando um conjunto de notas
        Set<Integer> notas = new HashSet<>(Arrays.asList(5, 10, 7, 9));
        System.out.println(notas);
        // Confira se nota 5 existe no conjunto
        System.out.println("Nota 5 existe no conjunto? "+notas.contains(5));
        // Exiba menor nota
        System.out.println("Menor nota: "+ Collections.min(notas));
        // Exiba maior nota
        System.out.println("Maior nota: "+ Collections.max(notas));
        // Soma de todos os elementos do conjunto
        Iterator<Integer> iterator = notas.iterator();
        int total = 0;
        while(iterator.hasNext()) {
            Integer num = iterator.next();
            total += num;
        }
        System.out.println("Soma de todos os elementos do conjunto: "+ total);
        // media de notas
        System.out.println("media: "+ total / notas.size());
        // Removendo item da posicao 0
        notas.remove(0);
        System.out.println("Item 0 removido: "+ notas);
        Iterator<Integer> it2 = notas.iterator();
        while (it2.hasNext()) {
            Integer num = it2.next();
            if(num <= 5) {
                it2.remove();
            }
        }
        System.out.println("removendo notas menores ou iguais a 5: "+ notas);

        // LinkedHashSet
        Set<Integer> n2 = new LinkedHashSet<>();
        n2.add(7);
        n2.add(9);
        n2.add(8);
        n2.add(10);
        System.out.println(n2);
        // Exibir todas as notas na ordem crescente
        Set<Integer> n3 = new TreeSet<>(n2);
        System.out.println(n3);
        // Apagar o conjunto
        notas.clear();
        System.out.println("o conjunto está vazio? "+notas.isEmpty());
    }
}
