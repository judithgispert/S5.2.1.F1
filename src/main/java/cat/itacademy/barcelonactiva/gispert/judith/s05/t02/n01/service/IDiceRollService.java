package cat.itacademy.barcelonactiva.gispert.judith.s05.t02.n01.service;

import cat.itacademy.barcelonactiva.gispert.judith.s05.t02.n01.domain.Player;
import cat.itacademy.barcelonactiva.gispert.judith.s05.t02.n01.dto.DiceRollDTO;

import java.util.List;

public interface IDiceRollService {
    public DiceRollDTO addGame(Player player);
    public List<DiceRollDTO> getGames(Player player);
    public void deleteGames(Player player);
}