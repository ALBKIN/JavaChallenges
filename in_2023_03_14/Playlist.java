// LEARN JAVA // ARRAYLISTS / Desert Island Playlist

package in_2023_03_14;

import java.util.ArrayList;

class Playlist {
    public static void main(String[] args) {
        // creating playlist
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        // adding songs to playlist
        desertIslandPlaylist.add("It's only for the weak!");
        desertIslandPlaylist.add("Full moon");
        desertIslandPlaylist.add("In Flames");
        desertIslandPlaylist.add("Barbie Girl");
        desertIslandPlaylist.add("Ostatnie tango");
        desertIslandPlaylist.add("Disco Polo");
        desertIslandPlaylist.add("Pisarz miłości");
        desertIslandPlaylist.add("Chryzantemy złociste");

        // checking playlist
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        // removing songs (playlist too big, max 5 songs)
        desertIslandPlaylist.remove("Pisarz miłości");
        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.remove(3);

        // checking new playlist size
        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        // swapping songs on playlist (need to find their position, set temporary var for swap, then swap)
        int indexA = desertIslandPlaylist.indexOf("It's only for the weak!");
        System.out.println(indexA);
        int indexB = desertIslandPlaylist.indexOf("Chryzantemy złociste");
        System.out.println(indexB);

        String tempA = "It's only for the weak!";

        // swapping first song
        desertIslandPlaylist.set(indexA, "Chryzantemy złociste");

        // checking playlist mid-swap
        System.out.println(desertIslandPlaylist);

        // finishing second half of swap
        desertIslandPlaylist.set(indexB, tempA);

        // checking the list after complete swap
        System.out.println(desertIslandPlaylist);
    }
}

