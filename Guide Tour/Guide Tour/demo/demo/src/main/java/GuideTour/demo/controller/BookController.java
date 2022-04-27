package GuideTour.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import GuideTour.demo.model.Book;
import GuideTour.demo.service.BookService;

public class BookController {
@Autowired
BookService bookService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/book", method=RequestMethod.POST)
    public ResponseEntity<Object> createBook(@RequestBody Book book){
        bookService.createBook(book);
        return new ResponseEntity<>("Booking is created successfully", HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/book/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Object> updateBook(@PathVariable("id") int id, @RequestBody Book book){
        bookService.updateBook(id,book);
        return new ResponseEntity<>("Booking is updated successfully", HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/book/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id")Integer id){
        bookService.deleteBook(id);
        return new ResponseEntity<>("Booking is deleted successfully", HttpStatus.OK);
    }
    
}
