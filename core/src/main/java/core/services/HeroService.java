package core.services;

import core.builders.HeroBuilder;
import core.models.Gender;
import core.models.Hero;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Scope("singleton")
public class HeroService {
    private final HashMap<String, Hero> db;

    public HeroService() {
        db = new HashMap<>();
        var batman = new HeroBuilder()
                .name("Batman")
                .alterEgo("Bruce Wayne")
                .gender(Gender.MALE)
                .hasEnemy(v -> v.name("The Joker"))
                .hasEnemy(v -> v.name("Two-Face"))
                .hasEnemy(v -> v.name("Mr. Freeze"))
                .hasEnemy(v -> v.name("The Riddler"))
                .build();
        db.put(batman.name.toLowerCase(), batman);

        var spiderman = new HeroBuilder()
                .name("Spiderman")
                .alterEgo("Peter Parker")
                .gender(Gender.MALE)
                .hasEnemy(v -> v.name("Green Goblin"))
                .hasEnemy(v -> v.name("Doctor Octopus"))
                .build();
        db.put(spiderman.name.toLowerCase(), spiderman);
    }

    public Hero getHeroByName(String name) {
        return db.get(name.toLowerCase());
    }
}
