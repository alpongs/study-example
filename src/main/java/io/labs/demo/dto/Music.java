package io.labs.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Music {

    public Music(String title, String imageUrl, String name, String genre) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.name = name;
        this.genre = genre;
    }

    private String title;        // 앨범이름.
    private String imageUrl;     // 이미지 URL
    private String name;         // 가수이름.
    private String genre;       // 장르
    // ....
}
