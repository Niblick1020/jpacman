package nl.tudelft.jpacman.game;

import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.points.PointCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import java.util.List;

public class SinglePlayerGameTest {

    private SinglePlayerGame game;
    private Player player;
    private Level level;
    private PointCalculator pointCalculator;

    @BeforeEach
    void setUp() {
        // Mock dependencies
        player = mock(Player.class);
        level = mock(Level.class);
        pointCalculator = mock(PointCalculator.class);

        // Initialize the game with mocked dependencies
        game = new SinglePlayerGame(player, level, pointCalculator);
    }

    @Test
    void testGameInitialization() {
        // Verify the game is initialized with the correct level
        assertSame(level, game.getLevel(), "The game should be initialized with the provided level.");

        // Verify the game is initialized with the correct player
        List<Player> players = game.getPlayers();
        assertEquals(1, players.size(), "There should be exactly one player.");
        assertSame(player, players.get(0), "The game should be initialized with the provided player.");
    }
}
