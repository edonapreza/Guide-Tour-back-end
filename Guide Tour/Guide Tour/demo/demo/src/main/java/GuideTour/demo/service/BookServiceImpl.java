package GuideTour.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import GuideTour.demo.model.Book;

@Service 
public class BookServiceImpl implements BookService {
    private static Map<Integer, Book> books = new HashMap<Integer, Book>();  
    //initialise a static Map. its used to store a key 
    //for auto id generation

    private final AtomicLong id = new AtomicLong();  // //incremented sequence numbers
    public BookServiceImpl(){              

        books.put((int)id.incrementAndGet(), new Book(
            id.intValue(), "Edona","Preza", "wssss"
        )); 
    }
    @Override
    public void createBook(Book Book) {// TODO Auto-generated method stub
        
            if(Book. containsKey(Book.getId())){  //condition for the creation of guides 
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Existig Id ...");
    
            }
            books.put(Book.getId(), Book);
        }
        
    
    @Override
    public void updateBook(Integer id, Book Book) {    
        books.remove(id);
        Book.setId(id);
        books.put(Book.getId(), Book);
        
    }
    @Override
    public void deleteBook(Integer id) {
        
        books.remove(id);
        
    }

}