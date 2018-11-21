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
public class Song extends SongComponent {
    
   //Class Atributtes 
    private String MusicName;
    private String BandName;
    private int ReleaseYear;

    public Song(String MusicName, String BandName, int ReleaseYear) {
        this.MusicName = MusicName;
        this.BandName = BandName;
        this.ReleaseYear = ReleaseYear;
    }

    @Override
    public String getMusicName() {
        return MusicName;
    }

    @Override
    public String getBandName() {
        return BandName;
    }

    @Override
    public int getReleaseYear() {
        return ReleaseYear;
    }
    
    
    @Override
    public void ShowMusicInfo(){
        System.out.println(getMusicName()+"was recorded by "+ getBandName()+" in "+getReleaseYear()+".");
    }
    
    
}
