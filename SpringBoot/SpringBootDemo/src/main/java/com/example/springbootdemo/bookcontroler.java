package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookcontroler {
    private final bookservice bs;

    public bookcontroler(bookservice bs) {
        this.bs = bs;
    }

    @GetMapping("\book")
    public String getBookDetails(){
            String title = bs.getBookDetails();

            return   title;
    }
}
