package com.example.test.controllers;

import com.example.test.controllers.model.BookVO;
import com.example.test.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    //TODO 4 fix saveBook exception
    BookService bookService;

    @PostMapping
    public ResponseEntity<BookVO> saveBook(@RequestHeader String requestId, @RequestBody BookVO book){

        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.OK);

    }

    //TODO 5 finish code to display list of book name from Google book api "https://www.googleapis.com/books/v1/volumes?maxResults=5&orderBy=relevance&q=oliver%20sacks"
    @GetMapping(path="/google")
    public ResponseEntity<List<BookVO>> retrieveGoogleBooks(@RequestHeader String requestId){
        return new ResponseEntity<>( HttpStatus.OK);

    }

}
