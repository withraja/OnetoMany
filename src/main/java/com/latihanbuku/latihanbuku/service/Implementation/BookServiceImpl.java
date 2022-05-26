package com.latihanbuku.latihanbuku.service.Implementation;

import java.util.ArrayList;
import java.util.List;

import com.latihanbuku.latihanbuku.DTO.BookDTO;
import com.latihanbuku.latihanbuku.DTO.ChapterDTO;
import com.latihanbuku.latihanbuku.entity.Book;
import com.latihanbuku.latihanbuku.entity.Chapter;
import com.latihanbuku.latihanbuku.repository.BookRepository;
import com.latihanbuku.latihanbuku.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDTO create(BookDTO bookDTO) {

        // KONVERSI BOOK KE BOOKDTO
        Book book = new Book();
        book.setTitle(bookDTO.getTitle());
        book.setAuthor(bookDTO.getAuthor());
        book.setYear(bookDTO.getYear());
        book.setIsDeleted(false);

        List<Chapter> chapterList = new ArrayList<>();
        for (ChapterDTO chapterDTO : bookDTO.getChapterDTOList()) {
            Chapter chapter = new Chapter();
            chapter.setName(chapterDTO.getName());
            chapter.setContent(chapterDTO.getContent());
            chapter.setIsDeleted(false);
            chapter.setBook(book);
            chapterList.add(chapter);
        }
        book.setChapterList(chapterList);
        Book bookCreated = bookRepository.save(book);

        // KONVERSI KEMBALI DARI BOOKDTO KE BOOK
        BookDTO bookDTOCreated = new BookDTO();
        bookDTOCreated.setTitle(bookCreated.getTitle());
        bookDTOCreated.setAuthor(bookCreated.getAuthor());
        bookDTOCreated.setYear(bookCreated.getYear());
        bookDTOCreated.setIsDeleted(false);
        bookDTOCreated.setId(bookCreated.getId());

        List<ChapterDTO> chapterDTOList = new ArrayList<>();
        for (Chapter chapter : bookCreated.getChapterList()) {
            ChapterDTO chapterDTO = new ChapterDTO();
            chapterDTO.setId(chapter.getId());
            chapterDTO.setName(chapter.getName());
            chapterDTO.setContent(chapter.getContent());
            chapterDTO.setIsDeleted(false);
            chapterDTOList.add(chapterDTO);
        }

        bookDTOCreated.setChapterDTOList(chapterDTOList);

        return bookDTOCreated;
    }

}
