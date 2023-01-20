package com.example.Library_Management_System.Service;

import com.example.Library_Management_System.Enums.CardStatus;
import com.example.Library_Management_System.Models.Card;
import com.example.Library_Management_System.Models.Student;
import org.springframework.stereotype.Service;

@Service
public class CardService {


    public Card createCard(Student student){

        Card newCard = new Card();


        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student); //For that new foreign key column

        return newCard;
    }


    //findById
    //



}
