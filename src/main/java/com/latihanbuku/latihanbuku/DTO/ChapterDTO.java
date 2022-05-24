package com.latihanbuku.latihanbuku.DTO;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ChapterDTO {
    private Long id;
    private String name;
    private String content;
    private BookDTO book;
    private Boolean isDeleted;
}
