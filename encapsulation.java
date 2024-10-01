public class encapsulation {
    String username;
    private String password;

    public encapsulation(String username){
        this.username = username;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password=password;
    }

    public static void main(String[] args) {
        encapsulation user1 = new encapsulation("SUBIKSHA");
        encapsulation user2= new encapsulation("KEERTHI");
        encapsulation user3 = new encapsulation("UMA");
        System.out.println(user1.getpassword());
        user1.setpassword("SUBI@12");
        System.out.println(user1.getpassword());
    }
}
