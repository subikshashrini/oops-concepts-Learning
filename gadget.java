public class gadget {
    String name;
    int price;
    public gadget(){
        this.name="unknown";
        this.price=0;
    }
    public gadget(String name,int price){
        this.name=name;
        this.price=price;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.price);
    }

    public static void main(String[] args) {
        gadget g1 = new gadget();
        gadget g2 = new gadget("PHONE",10000);
        g1.display();
        g2.display();
    }

}
