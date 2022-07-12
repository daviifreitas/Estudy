package academy.devdojo.springboot2.controller;


import academy.devdojo.springboot2.Util.Dateutil;
import academy.devdojo.springboot2.domain.Anime;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController {
    @Autowired
    private Dateutil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Boku no hero"), new Anime("Berserk"));
    }
}
