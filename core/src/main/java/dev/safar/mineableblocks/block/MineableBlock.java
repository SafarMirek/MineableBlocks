package dev.safar.mineableblocks.block;

public class MineableBlock implements IMineableBlock {

    private String name;
    private String displayName;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDisplayName() {
        return this.displayName;
    }
}
