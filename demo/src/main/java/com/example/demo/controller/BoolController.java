package com.example.demo.controller;

import com.example.demo.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BoolController {

   private List<Book> bookList=new ArrayList<>();


   public BoolController(){

       bookList.add(new Book("B001","Java Programming",450.0,"ISBN001","James Gosling",
               "Oracle","3rd","2020","Programming","English",550L,"Available"));

       bookList.add(new Book("B002","Python Basics",399.0,"ISBN002","Guido van Rossum",
               "O'Reilly","2nd","2019","Programming","English",420L,"Issued"));

       bookList.add(new Book("B003","C Programming",350.0,"ISBN003","Dennis Ritchie",
               "PHI","5th","2018","Programming","English",500L,"Available"));

       bookList.add(new Book("B004","Data Structures",500.0,"ISBN004","Mark Allen",
               "McGraw Hill","4th","2021","Computer Science","English",600L,"Available"));

       bookList.add(new Book("B005","Operating Systems",550.0,"ISBN005","Abraham Silberschatz",
               "Wiley","9th","2020","Computer Science","English",700L,"Issued"));

       bookList.add(new Book("B006","Database Systems",480.0,"ISBN006","Elmasri",
               "Pearson","6th","2019","Database","English",650L,"Available"));

       bookList.add(new Book("B007","Computer Networks",530.0,"ISBN007","Andrew Tanenbaum",
               "Pearson","5th","2021","Networking","English",720L,"Available"));

       bookList.add(new Book("B008","Software Engineering",460.0,"ISBN008","Ian Sommerville",
               "Pearson","10th","2018","Software","English",680L,"Issued"));

       bookList.add(new Book("B009","Web Development",400.0,"ISBN009","Jon Duckett",
               "Wiley","1st","2022","Web","English",350L,"Available"));

       bookList.add(new Book("B010","Spring Boot",520.0,"ISBN010","Craig Walls",
               "Manning","2nd","2021","Framework","English",480L,"Available"));

       bookList.add(new Book("B011","Hibernate in Action",490.0,"ISBN011","Gavin King",
               "Manning","3rd","2019","Framework","English",510L,"Issued"));

       bookList.add(new Book("B012","Machine Learning",600.0,"ISBN012","Tom Mitchell",
               "McGraw Hill","1st","2017","AI","English",620L,"Available"));

       bookList.add(new Book("B013","Artificial Intelligence",650.0,"ISBN013","Stuart Russell",
               "Pearson","4th","2020","AI","English",800L,"Available"));

       bookList.add(new Book("B014","Cloud Computing",570.0,"ISBN014","Rajkumar Buyya",
               "Morgan Kaufmann","2nd","2019","Cloud","English",560L,"Issued"));

       bookList.add(new Book("B015","Cyber Security",480.0,"ISBN015","William Stallings",
               "Pearson","2nd","2021","Security","English",530L,"Available"));

       bookList.add(new Book("B016","Linux Basics",300.0,"ISBN016","Christopher Negus",
               "Wiley","1st","2018","Operating System","English",400L,"Available"));

       bookList.add(new Book("B017","Android Development",450.0,"ISBN017","Reto Meier",
               "Wrox","3rd","2020","Mobile","English",470L,"Issued"));

       bookList.add(new Book("B018","iOS Development",470.0,"ISBN018","Apple Inc.",
               "Apple","1st","2021","Mobile","English",430L,"Available"));

       bookList.add(new Book("B019","DevOps Handbook",520.0,"ISBN019","Gene Kim",
               "IT Revolution","1st","2019","DevOps","English",390L,"Available"));

       bookList.add(new Book("B020","Clean Code",580.0,"ISBN020","Robert C. Martin",
               "Prentice Hall","1st","2008","Programming","English",464L,"Available"));

        System.out.println("This is controller");
    }
    @GetMapping("/ping")
    public String ping(){
        return "Api is working.....";
    }

    @GetMapping("/getlist")
    public List<Book> getBookList(){

       // System.out.println(bookList.get(1).getBookId().toString());
        return bookList;
    }
    @PostMapping("/addNewBook")
    public String addList(@RequestBody Book obj){
       bookList.add(new Book(obj.getBookId(), obj.getTitle(),
               obj.getPrice(), obj.getIsbn(), obj.getAuther(), obj.getPublisher(),
               obj.getEdition(), obj.getYearOfPublished(), obj.getGenre(), obj.getLanguage(),
               obj.getPages(), obj.getStatus()
               ));

       return "Add new book...";
    }

    @GetMapping("/book")
    public Book getById(@RequestParam String id){
      Book obj= bookList.stream().filter(bookId->bookId.getBookId().equals(id)).findFirst()
              .orElseThrow(()-> new RuntimeException("Book not found"));

       return obj;
    }
    @PutMapping("/{id}")
    public Book updateById(@PathVariable String id, @ModelAttribute Book obj){
        Book bookObj= bookList.stream().filter(bookId->bookId.getBookId().equals(id)).findFirst()
                .orElseThrow(()-> new RuntimeException("Book not found"));
        bookObj.setAuther(obj.getAuther());
        bookObj.setEdition(obj.getEdition());
        bookObj.setGenre(obj.getGenre());
        bookObj.setIsbn(obj.getIsbn());
        bookObj.setLanguage(obj.getLanguage());
        bookObj.setPages(obj.getPages());
        bookObj.setPrice(obj.getPrice());
        bookObj.setPublisher(obj.getPublisher());
        bookObj.setStatus(obj.getStatus());
        bookObj.setTitle(obj.getTitle());
        bookObj.setYearOfPublished(obj.getYearOfPublished());

       return bookObj;
    }
    @DeleteMapping("/{id}")
    public boolean removeById(@PathVariable String id){
      Book book= bookList.stream().filter(bookobj->bookobj.getBookId().equals(id)).findFirst().orElseThrow(()-> new RuntimeException("not found"));
      boolean statu=  bookList.remove(book);

       return statu ;

    }

    @DeleteMapping()
    public String removeAll(){

        bookList.clear();
        return "remove succssfully";

    }
}
