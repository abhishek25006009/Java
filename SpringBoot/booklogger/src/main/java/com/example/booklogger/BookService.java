package com.example.booklogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private static final Logger logger =
            LoggerFactory.getLogger(BookService.class);

    public String getBookDetails() {

        logger.trace("1. TRACE: Entering getBookDetails()");

        logger.debug("2. DEBUG: Preparing book details");

        logger.info("3. INFO: Book retrieval started");

        String title = "Java Programming";
        double price = 650.0;

        logger.info("4. INFO: Book title = {}", title);

        logger.debug("5. DEBUG: Book price = {}", price);

        if (price > 1000) {
            logger.warn("6. WARN: Book price is very high");
        } else {
            logger.info("6. INFO: Book price is within range");
        }

        logger.info("7. INFO: Book retrieval completed");

        return title;
    }

    public void demonstrateErrorLogging() {
        logger.error("ERROR: This is a demonstration error log");
    }
}