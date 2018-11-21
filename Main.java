/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author aluno.jogos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SongComponent RockMusic = new SongGroup("\n Rock Music", "is a broad genre of popular music that originated as in the United States in the early 1950s, and developed into a range of differ");
        SongComponent HeavyMetalMusic = new SongGroup("\n Heavy Metal", "The musical roots of Heavy Metal, including Hard Rock and the Blues. The specific influence on Heavy Metal by Hard Rock bands and artists such as the Kinks, Led Zeppelin and Jimi Hendrix.");

        RockMusic.add(new Song("Hound Dog", "Elvis Presley", 1953));
        RockMusic.add(new Song("Help!", "Beatles", 1965));
        RockMusic.add(HeavyMetalMusic);

        HeavyMetalMusic.add(new Song("Back in black", "AC/DC", 1980));
        HeavyMetalMusic.add(new Song("The Trooper", "Iron Maiden", 1988));

        //I/Top level Component that holds 
        SongComponent MyMusic = new SongGroup("My Song List", "My favorite musics");
        MyMusic.add(RockMusic);

        MyMusic.add(new Song("Chariots of Fire", "Vangelis ", 1981));

        DisckJockey Gaguinho = new DisckJockey(MyMusic);

        Gaguinho.ShowSongList();

       // System.out.println("###Falta ajustar este ponto###");
    }
    
   

}
