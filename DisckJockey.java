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
public class DisckJockey {
    
    
    SongComponent songList;
    public DisckJockey(SongComponent songList) {
        this.songList = songList;
    }
    public void ShowSongList(){
        songList.ShowMusicInfo();
    }
    
}
