package com.yourname.soldiervisuals;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FriendsList {
    private final List<UUID> friends = new ArrayList<>();

    public void addFriend(UUID player) {
        if (!friends.contains(player)) friends.add(player);
    }

    public void removeFriend(UUID player) {
        friends.remove(player);
    }

    public boolean isFriend(UUID player) {
        return friends.contains(player);
    }
}
