package com.example.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class bookservice {
    private final Logger log = LoggerFactory.getLogger(bookservice.class);
        public String getBookDetails(){
            log.trace("1. Trace: Entering getBookDetails()");
            String title = "Java";
            return title;
        }
}

