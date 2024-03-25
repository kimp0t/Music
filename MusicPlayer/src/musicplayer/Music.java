/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplayer;


public class Music {
    
    private String Title;
    private String Artist;
    private String Genre;

    public Music() {
    }

    public Music(String Title, String Artist, String Genre) {
        this.Title = Title;
        this.Artist = Artist;
        this.Genre = Genre;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    @Override
    public String toString() {
        return "Music{" + "Title=" + Title + ", Artist=" + Artist + ", Genre=" + Genre + '}';
    }
    
    
}
