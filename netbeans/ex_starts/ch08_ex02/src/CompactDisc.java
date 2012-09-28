/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dellinger
 */
public class CompactDisc extends Product {
    
    private String artist;
    
    public CompactDisc(){
        super();
        artist = "";
        count++;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "Artist:       " + artist + "\n";
    }
    
    
}
