package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No50 {

    static class Album implements Comparable<Album> {
        String genre;
        int play;

        Album(String genre, int play) {
            this.genre = genre;
            this.play = play;
        }

        int getPlay() {
            return this.play;
        }

        @Override
        public int compareTo(Album album) {
            int compareQuantity = album.getPlay();

            //descending order
            return compareQuantity - this.play;
        }
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer = {};
        HashMap<String, Integer> genresMap = new HashMap<>();
        HashMap<String, ArrayList<Integer>> albumIndexMap = new HashMap<>();
        ArrayList<Album> albums = new ArrayList<>();

        for(int i = 0; i < genres.length; i++) {
            int play = genresMap.getOrDefault(genres[i], 0);
            ArrayList<Integer> indexes = albumIndexMap.getOrDefault(genres[i], new ArrayList<>());
            genresMap.put(genres[i], play + plays[i]);
        }

        for(Map.Entry<String, Integer> genre : genresMap.entrySet()) {
            albums.add(new Album(genre.getKey(), genre.getValue()));
        }

        albums.sort(Album::compareTo);

        System.out.println(answer);
    }
}
