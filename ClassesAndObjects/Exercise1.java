class Box {
    int width,height,depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    int calculateVolume()
    {
        return width*height*depth;
    }
}
class Exercise1{
    
    public static void main(String[] args){
        
        
        Box b=new Box(10,11,13);
        System.out.println("The volume is "+b.calculateVolume());
        
        
        
    }
    
}
    
    
    
 
