public class methodoverloading {//shape class

    public static double  area(int r){
        return 3.14*r*r;
    }
    public static int area(int l,int b){
        return l*b;
    }
    public static int area(int h,int b,int d){
        return (h*b)/d;
    }

    public static void main(String[] args) {
        System.out.println("area of circle "+methodoverloading.area(5));
        System.out.println("area of circle "+methodoverloading.area(10,15));
        System.out.println("area of circle "+methodoverloading.area(10,25,2));

    }

}
