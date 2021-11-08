package model;

import java.awt.Color;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.Striker;

public class PlayerFactory {

	public GamePlayer getPlayer(String playerType) {
		if (playerType == null) {
			return null;
		}

		if (playerType.equalsIgnoreCase("STRIKER")) {
			return new Striker("Striker", Color.RED);
		} else if (playerType.equalsIgnoreCase("GOALKEEPER")) {
			return new Goalkeeper("Goalkeeper", Color.BLUE);
		}

		return null;
	}

}
