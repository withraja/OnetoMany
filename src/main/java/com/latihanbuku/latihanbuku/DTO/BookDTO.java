package com.latihanbuku.latihanbuku.DTO;

import java.util.Date;
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
    private Date year;
    private Boolean isDeleted;
    private List<ChapterDTO> chapterDTOList;

}
