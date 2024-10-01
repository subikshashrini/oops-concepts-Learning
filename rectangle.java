public class rectangle
{
    double length;
    double width;

    public rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double perimeter(){
        return (2*(length+width));
    }


    public static void main(String[] args) {
        rectangle woodrectangle = new rectangle(10,20);
        rectangle rect2 = new rectangle(30,40);
        rectangle rect3 = new rectangle(15,20);
        rectangle rect4 = new rectangle(35,40);

        System.out.println(woodrectangle.perimeter());
        System.out.println(rect2.perimeter());
        System.out.println(rect3.perimeter());
        System.out.println(rect4.perimeter());
    }



}
class subi{

}
