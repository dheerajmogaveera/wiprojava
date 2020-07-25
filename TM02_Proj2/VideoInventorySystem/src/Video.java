public class Video {
    private String videoName;
    private boolean checkout=false;
    private int rating;

    public Video(String videoName) {
        this.videoName = videoName;
    }
    
    

    public String getVideoName() {
        return videoName;
    }

    public boolean getCheckout() {
        return checkout;
    }

    public int getRating() {
        return rating;
    }
    
    void doCheckout()
    {
        checkout=!checkout;
    }
    void doReturn()
    {
        checkout=!checkout;
    }
    
    void recieveRating(int r)
    {
        rating=r;
    }
    
    
    
    
}
