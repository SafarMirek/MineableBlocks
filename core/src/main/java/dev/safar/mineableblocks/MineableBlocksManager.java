package dev.safar.mineableblocks;

import dev.safar.mineableblocks.block.IMineableBlock;
import dev.safar.mineableblocks.storage.DataStorage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MineableBlocksManager {

    private final List<IMineableBlock> mineableBlocks = new ArrayList<>();
    private final DataStorage storage;

    public MineableBlocksManager(DataStorage storage) {
        this.storage = storage;
    }

    public Optional<IMineableBlock> getMineableBlockByName(String name) {
        return mineableBlocks.stream()
                .filter(mineableBlock -> mineableBlock.getName().equalsIgnoreCase(name))
                .findFirst();
    }

}
