package GuideTour.demo.service;

import GuideTour.demo.model.Book;

public interface BookService {
    //create  methods for each request we want to create
    public abstract void createBook(Book Book);// create a new booking  

    public abstract void updateBook(Integer id, Book Book);
        // TODO Auto-generated method stub//  update the booking we just created  

    public abstract void deleteBook(Integer id);  //  delete the book through the id 

    //public static void createGuide(Book Book) {
    //}

    //public static void deleteGuide(Integer id) {
    //}

    //public static void updateBook(Integer id, String book) {
    //}

}
