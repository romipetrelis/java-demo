package app.controllers;

import core.builders.HeroBuilder;
import core.models.Hero;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hero")
public class HeroController {

    @GetMapping("/batman")
    public ResponseEntity<Hero> batman() {
        var model = new HeroBuilder().name("Batman").alterEgo("Bruce Wayne").build();

        return ResponseEntity.ok(model);
    }
}
