/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aluno.jogos
 */
public class SongGroup extends SongComponent {

    //the ArrayList contains any Songs or SongGroups of 
    // the CompositeObject
    private ArrayList songComponents = new ArrayList();
    //Another Class Atributes

    private String GroupName;
    private String GroupDescription;

    public SongGroup(String GroupName, String GroupDescription) {
        this.GroupName = GroupName;
        this.GroupDescription = GroupDescription;
    }

    public String getGroupName() {
        return GroupName;
    }

    public String getGroupDescription() {
        return GroupDescription;
    }

    @Override
    public void add(SongComponent newSongComponent) {
        songComponents.add(newSongComponent);
    }

    @Override
    public void remove(SongComponent deleteSongComponent) {
        songComponents.remove(deleteSongComponent);
    }

    @Override
    public SongComponent getChild(int componentId) {
        return (SongComponent) songComponents.get(componentId);
    }

    @Override
    public void ShowMusicInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription() + " \n");

        //print
        //using the java interator with arraylist iterator
        Iterator musicIterator = songComponents.iterator();

        while (musicIterator.hasNext()) {
            SongComponent song = (SongComponent) musicIterator.next();
            song.ShowMusicInfo();
        }
    }
    

}
