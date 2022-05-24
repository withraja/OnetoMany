package com.latihanbuku.latihanbuku.repository;

import com.latihanbuku.latihanbuku.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
