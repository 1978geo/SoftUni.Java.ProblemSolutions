package SoftUniJavaProblemSolutions.Fundamentals.Lab06_ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L0604Songs {

    static class Songs {

        String typeList;
        String songName;
        String songTime;

        public Songs(String typeList, String songName, String songTime) {
            this.typeList = typeList;
            this.songName = songName;
            this.songTime = songTime;
        }

        public String getTypeList() {
            return typeList;
        }

        public String getSongName() {
            return songName;
        }

        public String toString() {
            return String.format("%s", getSongName());
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Songs> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] songsList = scanner.nextLine().split("_");

            String typeList = songsList[0];
            String songName = songsList[1];
            String songTime = songsList[2];

            Songs song = new Songs(typeList, songName, songTime);

            songs.add(song);
        }

        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Songs song : songs) {
                System.out.println(song.getSongName());
            }
        }

        List<Songs> filterSongs = songs.stream().filter(e -> e.getTypeList().equals(command))
                .collect(Collectors.toList());
        for (Songs song : filterSongs) {
            System.out.println(song.getSongName());
        }
    }
}
