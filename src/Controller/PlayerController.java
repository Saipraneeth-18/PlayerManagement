package Controller;

import Model.Player;
import View.PlayerView;
import java.util.*;

public class PlayerController {
    private List<Player> players;
    private PlayerView view;

    public PlayerController(PlayerView view) {
        this.players = new ArrayList<>();
        this.view = view;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updatePlayerStats(int id, int runs, int wickets) {
        for (Player p : players) {
            if (p.getId() == id) {
                p.setRuns(runs);
                p.setWickets(wickets);
            }
        }
    }

    public void showPlayer(int id) {
        for (Player p : players) {
            if (p.getId() == id) {
                view.displayPlayer(p);
                return;
            }
        }
        System.out.println("Player with ID " + id + " not found.");
    }

    public void showTeam(String teamName) {
        view.displayTeam(players, teamName);
    }

    public void showTopScorer() {
        Player top = Collections.max(players, Comparator.comparingInt(Player::getRuns));
        view.displayTopScorer(top);
    }

    public void showTopWicketTaker() {
        Player top = Collections.max(players, Comparator.comparingInt(Player::getWickets));
        view.displayTopWicketTaker(top);
    }
}
