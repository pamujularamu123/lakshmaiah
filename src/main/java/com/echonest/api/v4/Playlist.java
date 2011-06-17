package com.echonest.api.v4;

import java.util.List;

/**
 * Represents a playlist
 * @author plamere
 *
 */
public class Playlist  {
    private List<Song> songs;
    private String session = null;
    
    public Playlist(List<Song> songs) {
        this.songs = songs;
    }
    
    Playlist(List<Song> songs, String session) {
        this.songs = songs;
        this.session = session;
    }
    
    /**
     * Gets the list of songs for the playlist
     * @return the list of songs
     */
    public List<Song> getSongs() {
        return songs;
    }
    
    /**
     * Gets the session ID for the playlist. Only dynamic playlists
     * have session IDs
     * @return the session ID
     */
    public String getSession() {
        return session;
    }

}
