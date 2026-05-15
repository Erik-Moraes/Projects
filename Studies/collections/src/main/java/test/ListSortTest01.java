package test;
import dominio.Manga;
import java.util.*;

class MangaByIdComparator implements Comparator <Manga>{


    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class ListSortTest01 {

    public static void main(String[] args) {

        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L, "One Piece", 39.90, 2));
        mangas.add(new Manga(4L, "Naruto", 19.30, 10));
        mangas.add(new Manga(2L, "Soul Eater", 12.50, 5));
        mangas.add(new Manga(3L, "Jujutsu Kaisen", 22.45, 7));

        mangas.sort(new MangaByIdComparator());

        mangas.forEach(System.out::println);
    }
}
