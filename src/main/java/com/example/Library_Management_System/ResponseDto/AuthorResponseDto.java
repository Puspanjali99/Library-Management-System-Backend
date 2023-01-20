package com.example.Library_Management_System.ResponseDto;

import com.example.Library_Management_System.Models.Book;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class AuthorResponseDto {

    private int id;

    private String name;

    private int age;

    private String country;

    private String email;

}