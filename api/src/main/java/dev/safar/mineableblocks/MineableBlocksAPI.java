package dev.safar.mineableblocks;

import dev.safar.mineableblocks.block.IMineableBlock;

import java.util.Optional;

public interface MineableBlocksAPI {

    Optional<IMineableBlock> getMineableBlockByName(String name);

}
