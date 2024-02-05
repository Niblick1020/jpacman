package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.sprite.AnimatedSprite;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EnumMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class PlayerTest {
    private Player player;
    private AnimatedSprite deathSprite;
    private EnumMap<Direction, Sprite> spriteMap;

    @BeforeEach
    void setUp() {
        // Mock the necessary sprites
        deathSprite = mock(AnimatedSprite.class);
        spriteMap = new EnumMap<>(Direction.class);
        Sprite sprite = mock(Sprite.class);
        for (Direction dir : Direction.values()) {
            spriteMap.put(dir, sprite);
        }

        // Use PacManSprites for real sprites in the setup
        PacManSprites sprites = new PacManSprites();
        PlayerFactory factory = new PlayerFactory(sprites);

        // Create a real player with mocked death animation for testing
        player = factory.createPacMan();
    }

    @Test
    void testIsAliveInitially() {
        assertTrue(player.isAlive(), "Player should be alive initially.");
    }

    @Test
    void testDiesAndRevives() {
        player.setAlive(false);
        assertFalse(player.isAlive(), "Player should be dead after setAlive(false) is called.");

        player.setAlive(true);
        assertTrue(player.isAlive(), "Player should be alive after setAlive(true) is called.");
    }
}
