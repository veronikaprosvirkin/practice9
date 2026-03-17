public class Library {
   String name;
   public Library(){
       this.name=name;
   }
   public class Book{
       String title;
       String author;
       public Book(String title, String author){
           this.author=author;
           this.title=title;
       }

       public String bookLabel(String name){
           return "Book: " + title + " by " + author + ". Library: " + name;
       }
   }
}
