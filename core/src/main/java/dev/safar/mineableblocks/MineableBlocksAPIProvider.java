package dev.safar.mineableblocks;

import dev.safar.mineableblocks.block.IMineableBlock;

import java.util.Optional;

public class MineableBlocksAPIProvider implements MineableBlocksAPI {

    private final MineableBlocksManager mineableBlocksManager;

    public MineableBlocksAPIProvider(MineableBlocksManager mineableBlocksManager) {
        this.mineableBlocksManager = mineableBlocksManager;
    }

    @Override
    public Optional<IMineableBlock> getMineableBlockByName(String name) {
        return mineableBlocksManager.getMineableBlockByName(name);
    }
}
