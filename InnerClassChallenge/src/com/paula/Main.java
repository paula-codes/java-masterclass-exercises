package com.paula;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Storm", "Deep Purple");
        album.addSong("Bad Storm", 4.6);
        album.addSong("Wind", 4.2);
        album.addSong("Kiss", 3.4);
        album.addSong("On the road", 3.1);
        album.addSong("Driving home", 4.1);
        albums.add(album);

        album = new Album("Kickstart", "Example");
        album.addSong("Skies Don't Lie", 4.6);
        album.addSong("Kickstart", 4.2);
        album.addSong("Drunk", 3.4);
        album.addSong("My birthday", 3.1);
        album.addSong("Driving mad", 4.1);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Wind", playList);
        albums.get(0).addToPlayList("Kiss", playList);
        albums.get(0).addToPlayList("Love", playList);

        albums.get(0).addToPlayList(5, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(10, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("not songs in the playlist");
            return;
        } else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete. ");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else{
                            System.out.println("We are at the start");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() >0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n" +
                "3 - to replay the current song\n"+
                "4 - to list songs in the playlist\n"+
                "5 - available actions\n" +
                "6 - remove the song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===============");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===============");

    }
}
