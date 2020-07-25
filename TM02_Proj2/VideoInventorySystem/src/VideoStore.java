public class VideoStore{
        
    Video store[]=new Video[1000];
    static int n=0;
    

    void addVideo(String name)
    {
        store[n]=new Video(name);
        n++;
        
    }
    void doCheckout(String name)
    {
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(store[i].getVideoName().equals(name))
            {
                store[i].doCheckout();
                found=true;
                break;
            }
            
            
        }
        if(found==false)
        {
            System.out.println("No such video available");
        }
        else
             System.out.println("Video "+"''"+name+"''"+" has been checked out sucessfully");
     }
    
    void doReturn(String name)
    {
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(store[i].getVideoName().equals(name))
            {
                store[i].doReturn();
                found=true;
                break;
            }
           
            
        }
         if(found==false)
            {
                System.out.println("No such video found");
            }
         else
              System.out.println("Video "+"''"+name+"''"+" has been returned sucessfully");
        
        
     }
    
    void recieveRating(String name,int rating)
    {
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(store[i].getVideoName().equals(name))
            {
               store[i].recieveRating(rating);
               found=true;
               break;
                
            }
        }
         if(found==false)
            {
                System.out.println("No such video found");
            }
         else
             System.out.println("Rating "+"''"+rating+"''"+" has been added sucessfully");
    }
    
    void listInventory()
    {   
        System.out.println("Video Name"+"   |   "+"Checkout Status"+"   |   "+"Rating");
        for(int i=0;i<n;i++)
        {
            System.out.println(store[i].getVideoName()+"   |   "+store[i].getCheckout()+"   |   "+store[i].getRating());
        }
    }
    
    
}
