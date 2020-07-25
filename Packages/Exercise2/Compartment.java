class Compartment{
    double height,width,breadth;

    public Compartment(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getBreadth() {
        return breadth;
    }
    public void display()
    {
        System.out.println("height:"+this.height+" width:"+this.width+" breadth:"+this.breadth);
    }
}