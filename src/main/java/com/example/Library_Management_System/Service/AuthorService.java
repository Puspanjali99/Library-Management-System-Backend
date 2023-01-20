package com.example.Library_Management_System.Service;

import com.example.Library_Management_System.Convertors.AuthorConvertors;
import com.example.Library_Management_System.Models.Author;
import com.example.Library_Management_System.Repository.AuthorRepository;
import com.example.Library_Management_System.RequestDto.AuthorRequestDto;
import com.example.Library_Management_System.ResponseDto.AuthorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDto authorRequestDto){

        try {
            Author author = AuthorConvertors.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        }catch (Exception e){
            log.info("createAuthor has caused an error");
            return "Create author didnt work";
        }
        return "Author created successfully";
    }

    public List<AuthorResponseDto> findAuthorByName(String name){

        List<Author> authors = authorRepository.findByName(name);

        List<AuthorResponseDto> authorResponseDtos = AuthorConvertors.convertEntityToDto(authors);

        return authorResponseDtos;

    }

}