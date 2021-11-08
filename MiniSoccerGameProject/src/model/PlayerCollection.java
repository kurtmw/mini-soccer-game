package model;

import java.util.ArrayList;

import model.players.GamePlayer;

public class PlayerCollection<E> extends ArrayList<E>{

	private static final long serialVersionUID = 1L;
	private final ArrayList<GamePlayer> gamePlayerList;
	
	public PlayerCollection() {
		gamePlayerList = new ArrayList<GamePlayer>();
	}
	
	@Override
	public boolean add(E e) {
		
		if (e != null) {
			
			gamePlayerList.add((GamePlayer) e);
			
			return true;
		}
		
		return false;
	}
	
	public GamePlayer get(String string) {
		
		return gamePlayerList.get(gamePlayerList.indexOf(string));
	}


}
