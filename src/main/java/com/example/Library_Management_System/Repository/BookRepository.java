package com.example.Library_Management_System.Repository;

import com.example.Library_Management_System.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
