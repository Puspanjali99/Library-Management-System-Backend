package com.example.Library_Management_System.ResponseDto;

import com.example.Library_Management_System.Enums.Genre;
import lombok.Builder;

@Builder
public class BookResponseDto {

    String name;
    Genre genre;

}