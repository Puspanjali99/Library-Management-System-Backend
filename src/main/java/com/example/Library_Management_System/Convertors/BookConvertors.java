package com.example.Library_Management_System.Convertors;

import com.example.Library_Management_System.Models.Book;
import com.example.Library_Management_System.RequestDto.BookRequestDto;

public class BookConvertors{


    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){

        Book book = Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()) .build();

        return book;
    }


}
