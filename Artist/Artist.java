public class Artist implements Comparable<Artist>
{
    private String artistName;
    private String songName;
    private String artistImage;
    private long yearlySales;

    public Artist(String artistName, String songName, String artistImage, long yearlySales) 
    {
        this.artistImage = artistImage;
        this.artistName = artistName;
        this.songName = songName;
        this.yearlySales = yearlySales;
    }

    public String getArtistName() 
    {
        return this.artistName;
    }
    
    public void setArtistName(String artistName) 
    {
        this.artistName = artistName;
    }


    public String getSongName() 
    {
        return this.songName;
    }
    public void setSongName(String songName) 
    {
        this.songName = songName;
    }


    public String getArtistImage() 
    {
        return this.artistImage;
    }
    public void setArtistImage(String artistImage) 
    {
        this.artistImage = artistImage;
    }


    public long getYearlySales() 
    {
        return this.yearlySales;
    }
    public void setYearlySales(long yearlySales) 
    {
        this.yearlySales = yearlySales;
    }

    @Override
    public int compareTo(Artist o) 
    {
       if(yearlySales>o.yearlySales)
       {
        return 1;
       }
       else if(yearlySales<o.yearlySales)
       {
        return -1;
       }
       else
       {
        return artistName.compareTo(o.artistName);
       }
    }
    //getters and setters
    

    
}
