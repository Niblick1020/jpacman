package nl.tudelft.jpacman.npc.ghost;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map; // Import for the Map interface
import java.util.EnumMap; // Import for the EnumMap class

public class InkyTest {

    @Test
    void InkyFacesEastWhenCreated() {

//        PacManSprites sprites = new PacManSprites();
        Map<Direction, Sprite> spriteMap = new EnumMap<>(Direction.class);

        Inky inky = new Inky(spriteMap);

        assertEquals(Direction.EAST, inky.getDirection(), "inky should face EAST upon creation.");
    }
}
