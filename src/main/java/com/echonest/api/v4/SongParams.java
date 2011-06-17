package com.echonest.api.v4;

public class SongParams extends Params {

    public static String SORT_TEMPO = "tempo";
    public static String SORT_DURATION = "duration";
    public static String SORT_LOUDNESS = "loudness";
    public static String SORT_ENERGY = "energy";
    public static String SORT_DANCEABILITY = "danceability";

    public static String SORT_ARTIST_FAMILIARITY = "artist_familiarity";
    public static String SORT_ARTIST_HOTTTNESSS = "artist_hotttnesss";
    public static String SORT_SONG_HOTTTNESSS = "song_hotttnesss";
    public static String SORT_LATITUDE = "latitude";
    public static String SORT_LONGITUDE = "longitude";
    public static String SORT_MODE = "mode";
    public static String SORT_KEY = "key";

    public void setTitle(String title) {
        add("title", title);
    }

    public void setArtist(String artist) {
        add("artist", artist);
    }

    public void addDescription(String desc) {
        add("description", desc);
    }

    public void setID(String id) {
        add("id", id);
    }

    public void setCombined(String combined) {
        add("combined", combined);
    }

    public void setArtistID(String artistID) {
        add("artist_id", artistID);
    }

    public void setResults(int results) {
        add("results", results);
    }

    public void setMaxTempo(float tempo) {
        add("max_tempo", tempo);
    }

    public void setMinTempo(float tempo) {
        add("min_tempo", tempo);
    }

    public void setMaxDuration(float val) {
        add("max_duration", val);
    }

    public void setMinDuration(float val) {
        add("min_duration", val);
    }

    public void setMaxLoudness(float val) {
        add("max_loudness", val);
    }

    public void setMinLoudness(float val) {
        add("min_loudness", val);
    }

    public void setMaxArtistFamiliarity(float val) {
        add("artist_max_familiarity", val);
    }
    
    public void setMaxDanceability(float val) {
        add("max_danceability", val);
    }

    public void setMinDanceability(float val) {
        add("min_danceability", val);
    }
    
    public void setMaxEnergy(float val) {
        add("max_energy", val);
    }

    public void setMinEnergy(float val) {
        add("min_energy", val);
    }


    public void setMinArtistFamiliarity(float val) {
        add("artist_min_familiarity", val);
    }

    public void setMaxArtistHotttnesss(float val) {
        add("artist_max_hotttnesss", val);
    }

    public void setMinSongHotttnesss(float val) {
        add("song_min_hotttnesss", val);
    }

    public void setMaxSongHotttnesss(float val) {
        add("song_max_hotttnesss", val);
    }

    public void setMinArtistHotttnesss(float val) {
        add("artist_min_hotttnesss", val);
    }

    public void setMaxLongitude(float val) {
        add("max_longitude", val);
    }

    public void setMinLongitude(float val) {
        add("min_longitude", val);
    }

    public void setMaxLatitude(float val) {
        add("max_latitude", val);
    }

    public void setMinLatitude(float val) {
        add("min_latitude", val);
    }

    public void setMode(int mode) {
        add("mode", mode);
    }

    public void setKey(int key) {
        add("key", key);
    }

    public void setLimit(boolean limit) {
        add("limit", limit);
    }

    public void includeAudioSummary() {
        add("bucket", "audio_summary");
    }

    public void includeTracks() {
        add("bucket", "tracks");
    }

    public void includeSongHotttnesss() {
        add("bucket", "song_hotttnesss");
    }

    public void includeArtistHotttnesss() {
        add("bucket", "artist_hotttnesss");
    }

    public void includeArtistFamiliarity() {
        add("bucket", "artist_familiarity");
    }

    public void includeArtistLocation() {
        add("bucket", "artist_location");
    }

    public void addIDSpace(String idspace) {
        if (!idspace.startsWith("id:")) {
            idspace = "id:" + idspace;
        }
        add("bucket", idspace);
    }

    public void sortBy(String sort, boolean ascending) {
        if (ascending) {
            sort = sort + "-asc";
        } else {
            sort = sort + "-desc";
        }
        add("sort", sort);
    }
}
