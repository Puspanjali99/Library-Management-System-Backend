package com.example.Library_Management_System.RequestDto;

import com.example.Library_Management_System.Enums.Genre;
import lombok.Data;


@Data
public class BookRequestDto {


    private String name;

    private Genre genre;

    private int authorId;

}
