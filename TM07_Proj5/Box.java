
public class Box implements Comparable<Box>{

	double length,width,height,Voume;
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.Voume=this.length*this.height*this.width;
	}
	
@Override
 public String toString() {
	
	return "length = "+length+" width = "+width+ "height = " + height +" Volume= "+Voume;
  }
  @Override
  public boolean equals(Object obj) {
	 Box b=(Box)obj;
	 if(this.Voume==b.Voume)
		 return true;
	return false;
      }

	@Override
	public int compareTo(Box b) {
		if(b.Voume==this.Voume)
			return 0;
		else if(b.Voume>this.Voume)
			return -1;
		else
			return 1;
		
	}

}
