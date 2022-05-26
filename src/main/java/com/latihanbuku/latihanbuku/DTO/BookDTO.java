package com.latihanbuku.latihanbuku.DTO;

import java.util.List;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDTO {

    private Long id;
    private String title;
    private String author;
    private String year;
    private Boolean isDeleted;
    private List<ChapterDTO> chapterDTOList;

}
