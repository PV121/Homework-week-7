package homework;

public class Wall {
    double height,width;
    double area;
    Wall (){

    }
    public Wall (double width,double height){
        this.height=height;
        this.width=width;

        if (height<0){
            this.height=0;
        }if (width<0){
            this.width=0;
        }
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double setWidth (double width){
        if (width<0){
            this.width=0;
        }
        return width;
    }
    public double setHeight (double height){
        if (height<0){
            this.height=0;
        }
        return height;
    }
    public double getArea () {
        double area= height*width;
        return area;
    }

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }



}
