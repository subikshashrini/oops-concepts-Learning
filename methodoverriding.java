public class methodoverriding {//employee class
    String name;
    String roll;

    public methodoverriding(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }
    public void work() {
        System.out.println(this.name+"--manager working in Suan Technology");

    }
}

class intern extends methodoverriding{
    public intern(String name,String roll){
        super(name,roll);
    }

    public void work(){
        System.out.println(this.name+"--Working as intern");
    }

}

class Main {
    public static void main(String[] args) {
        intern subi = new intern("Subiksha","Intern");
        methodoverriding employee = new methodoverriding("Mathan","Manager");

        subi.work();
        employee.work();

    }
}
