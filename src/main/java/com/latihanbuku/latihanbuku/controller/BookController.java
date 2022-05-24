package com.latihanbuku.latihanbuku.controller;

import com.latihanbuku.latihanbuku.DTO.BookDTO;
import com.latihanbuku.latihanbuku.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")

public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public ResponseEntity<BookDTO> create(@RequestBody BookDTO bookDTO) {
        BookDTO bookDTOCreated = bookService.create(bookDTO);
        return new ResponseEntity<BookDTO>(bookDTOCreated, HttpStatus.CREATED);
    }
}