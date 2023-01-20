package com.example.Library_Management_System.Controllers;

import com.example.Library_Management_System.Models.Author;
import com.example.Library_Management_System.RequestDto.AuthorRequestDto;
import com.example.Library_Management_System.ResponseDto.AuthorResponseDto;
import com.example.Library_Management_System.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/create")
    public String createAuthor(@RequestBody()AuthorRequestDto authorRequestDto){

        return authorService.createAuthor(authorRequestDto);
    }

    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> findByName(@PathVariable("name")String name){

        return authorService.findAuthorByName(name);
    }
}