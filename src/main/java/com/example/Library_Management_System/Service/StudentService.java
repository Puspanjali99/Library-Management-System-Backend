package com.example.Library_Management_System.Service;
import com.example.Library_Management_System.Enums.CardStatus;
import com.example.Library_Management_System.Models.Card;
import com.example.Library_Management_System.Models.Student;
import com.example.Library_Management_System.Repository.StudentRepository;
import com.example.Library_Management_System.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    @Autowired
    CardService cardService;

    public String createStudent(StudentRequestDto studentRequestDto){

        //Step pending here :
        //Convert Dto to Entity ??

        Student student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setCountry(studentRequestDto.getCountry());
        student.setEmail(studentRequestDto.getEmail());
        student.setName(studentRequestDto.getName());


        Card newCard = cardService.createCard(student);


        //For that bidirectional relation
        student.setCard(newCard);

        studentRepository.save(student);
        //cardRepository.save() will automatically be taken of.

        return "Successfully added student and card";


    }


}
