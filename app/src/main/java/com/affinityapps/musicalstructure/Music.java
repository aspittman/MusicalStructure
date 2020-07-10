package com.affinityapps.musicalstructure;

public class Music {

    private String playSong;
    private String songTitle;
    private String artistName;

    public Music(String playSong, String songTitle, String artistName) {
        this.playSong = playSong;
        this.songTitle = songTitle;
        this.artistName = artistName;
    }

    public String getPlaySong() {
        return playSong;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtistName() {
        return artistName;
    }
}
