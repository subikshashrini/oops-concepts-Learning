public class book {
    String title;
    String author;
    int pages;

   public book(String title,String author,int pages){
        this.title= title;
        this.author = author;
        this.pages = pages;
    }


    public static void main(String[] args) {
        book libbook=new book("ABCD","RUSKIN BOND",1000);

        System.out.println(libbook.title);
        System.out.println(libbook.author);
        System.out.println(libbook.pages);


    }
}

