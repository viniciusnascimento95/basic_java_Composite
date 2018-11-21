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
public abstract class  SongComponent {

//this class acts as an interface for every song (leaf)
    //and SongGroup (Composite) thet we create
    //method to retreive song name
    public String getMusicName() {
        throw new UnsupportedOperationException();

    }

    //method to retreive band names(s)
    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    //Method to retreive release year
    public int getReleaseYear() {
        throw new UnsupportedOperationException();

    }

    //Method to print information about specific song or songgroup
    public void ShowMusicInfo() {
        throw new UnsupportedOperationException();
    }

    //Specific operations to Composite Objectc
    public void add(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(SongComponent deletedSongComponent) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getChild(int componentId) {
        throw new UnsupportedOperationException();
    }

}
