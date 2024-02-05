package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map; // Import for the Map interface
import java.util.EnumMap; // Import for the EnumMap class

public class BlinkyTest {

    @Test
    void InkyFacesEastWhenCreated() {

//        PacManSprites sprites = new PacManSprites();
        Map<Direction, Sprite> spriteMap = new EnumMap<>(Direction.class);

        Blinky blinky = new Blinky(spriteMap);

        assertEquals(Direction.EAST, blinky.getDirection(), "blinky should face EAST upon creation.");
    }
}
