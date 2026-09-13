package io.github.tanishworks.deathbanmod;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class EliminationManager {

    private static final Set<UUID> ELIMINATED = new HashSet<>();

    public static void eliminate(UUID uuid) {
        ELIMINATED.add(uuid);
    }

    public static boolean isEliminated(UUID uuid) {
        return ELIMINATED.contains(uuid);
    }
}
