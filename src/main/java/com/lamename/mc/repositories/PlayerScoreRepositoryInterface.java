package com.lamename.mc.repositories;

import com.google.inject.ImplementedBy;
import com.lamename.mc.models.PlayerScore;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;

@ImplementedBy(PlayerScoreRepository.class)
public interface PlayerScoreRepositoryInterface {

    PlayerScore getPlayerScore(UUID uuid);

    void savePlayerScore(PlayerScore score);

    List<PlayerScore> findAll(Comparator<PlayerScore> comp, String slice);
    List<PlayerScore> findAll(Comparator<PlayerScore> comp);


}
