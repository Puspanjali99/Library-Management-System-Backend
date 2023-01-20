package com.example.Library_Management_System.Service;

import com.example.Library_Management_System.Convertors.BookConvertors;
import com.example.Library_Management_System.Models.Author;
import com.example.Library_Management_System.Models.Book;
import com.example.Library_Management_System.Repository.AuthorRepository;
import com.example.Library_Management_System.Repository.BookRepository;
import com.example.Library_Management_System.RequestDto.BookRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;

    public String createBook(BookRequestDto bookRequestDto){

        Book book = BookConvertors.convertDtoToEntity(bookRequestDto);

        //I need to set the AuthorEntity :

        int authorId = bookRequestDto.getAuthorId();

        //Getting the author Entity
        Author author  = authorRepository.findById(authorId).get();

        book.setAuthor(author);

        //That book list also needs to be updated

        List<Book> currentListOfBooks = author.getBooksWritten();
        currentListOfBooks.add(book);
        author.setBooksWritten(currentListOfBooks);

        //Save the author
        authorRepository.save(author);

        //Save the book
        //This function will automatically be called by the parent save

        return "succesfully added book";

    }

}

