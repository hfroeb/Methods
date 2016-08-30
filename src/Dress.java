/**
 * Created by halleyfroeb on 8/29/16.
 */ //Stores information about the description of a dress
public class Dress {
    String color;
    int size;
    boolean itFits;

    public Dress(String color, int size, boolean itFits) {
        this.color = color;
        this.size = size;
        this.itFits = itFits;
    }
    public String getColor (String color){
        return color;
    }
    public void setColor (String color){
        this.color = color;
    }

    public int getSize (int size){
        return size;
    }
    public void setSize (int size){
        this.size = size;
    }

    public boolean getItFits (boolean itFits){
        return itFits;
    }
    public void setItFits (boolean itFits){
        this.itFits = itFits;
    }

    public void tryAgain (){
        if(itFits != true){
        System.out.println("Try another size");
        }
    }
}
