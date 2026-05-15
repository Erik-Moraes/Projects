package test;

import dominio.Consumidor;
import dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {

    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor ("Erik");
        Consumidor consumidor2 = new Consumidor("Erik M");

        Manga manga1 = new Manga(1L, "One Piece", 39.90, 2);
        Manga manga2 = new Manga(4L, "Naruto", 19.30, 10);
        Manga manga3 = new Manga(2L, "Soul Eater", 12.50, 5);
        Manga manga4 = new Manga(3L, "Jujutsu Kaisen", 22.45, 7);

        List <Manga> MangaConsumidor1List = List.of(manga1, manga2, manga3);
        List <Manga> MangaConsumidor2List = List.of(manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, MangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, MangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(" - " + manga.getNome());
            }

        }

    }
}
