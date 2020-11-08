package io.labs.demo.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import io.labs.demo.dto.Music;

@Service
public class ExampleService {

    public List<Music> resultValue() {
        // TODO :: RestApi 호출. 멜론.
        List<Music> musicList = Arrays.asList(
            new Music("1", "2", "3", "4"),
            new Music("5", "6", "7", "8")
        );
        return musicList;
    }

}
