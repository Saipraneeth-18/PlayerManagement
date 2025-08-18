import Model.Player;
import View.PlayerView;
import Controller.PlayerController;

public class Main {
    public static void main(String[] args) {
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(view);

        // Adding some players
        controller.addPlayer(new Player(1, "Virat Kohli", "RCB", "Batsman", 6000, 4));
        controller.addPlayer(new Player(2, "MS Dhoni", "CSK", "Wicket-Keeper", 5000, 1));
        controller.addPlayer(new Player(3, "Jasprit Bumrah", "MI", "Bowler", 500, 150));
        controller.addPlayer(new Player(4, "Rohit Sharma", "MI", "Batsman", 5500, 2));

        // Show player details
        controller.showPlayer(1);

        // Show team players
        controller.showTeam("MI");

        // Update stats
        controller.updatePlayerStats(1, 6100, 5);
        controller.showPlayer(1);

        // Show top scorer and wicket taker
        controller.showTopScorer();
        controller.showTopWicketTaker();
    }
}
