import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Library {


    List<String> titles = new ArrayList<>();

    public void addBook (String title){
        titles.add(title);
    }

    public void removeBook (String title){
        titles.remove(title);
    }

    public void listSorted(){

        List<String> copy = new ArrayList<>(titles);
        Collections.sort(copy);
        copy.forEach(System.out::println);

    }

    public void list(){
        System.out.println(titles);
    }

    List<String> searchForWord (String word){

     return titles.stream()
             .filter(titles-> titles.toLowerCase().contains(word.toLowerCase()))
             .collect(Collectors.toList());
    };




    public static void main(String[] args) {


        Library library = new Library();
        library.addBook("Fundacao: Parte 1 ");
        library.addBook("Fundacao: Parte 2");
        library.addBook("Guia do mochileiro das Galaxias");
        library.addBook("Entendendo algoritmos");
        library.list();
        System.out.println("Antes da remoção ordenado: ");
        library.listSorted();
        System.out.println("===============================");
        System.out.println("Depois da remoção");
        library.removeBook("Entendendo algoritmos");
        library.listSorted();
        System.out.println("===========================");
        library.list();
        System.out.println("===========================");
        System.out.println("Procurando por palavra: ");
        System.out.println(library.searchForWord("fu"));


    }

}
