package net.minecraft.server;

public class EntityMagmaCube extends EntitySlime {

    public EntityMagmaCube(World world) {
        super(world);
        this.texture = "/mob/lava.png";
        this.fireProof = true;
        this.aN = 0.2F;
    }

    public boolean canSpawn() {
        return this.world.difficulty > 0 && this.world.b(this.boundingBox) && this.world.getCubes(this, this.boundingBox).isEmpty() && !this.world.containsLiquid(this.boundingBox);
    }

    public int aW() {
        return this.getSize() * 3;
    }

    public float c(float f) {
        return 1.0F;
    }

    protected String h() {
        return "flame";
    }

    protected EntitySlime i() {
        return new EntityMagmaCube(this.world);
    }

    protected int getLootId() {
        return Item.MAGMA_CREAM.id;
    }

    protected void dropDeathLoot(boolean flag, int i) {
        int j = this.getLootId();

        if (j > 0 && this.getSize() > 1) {
            int k = this.random.nextInt(4) - 2;

            if (i > 0) {
                k += this.random.nextInt(i + 1);
            }

            for (int l = 0; l < k; ++l) {
                this.b(j, 1);
            }
        }
    }

    public boolean isBurning() {
        return false;
    }

    protected int j() {
        return super.j() * 4;
    }

    protected void k() {
        this.b *= 0.9F;
    }

    protected void bi() {
        this.motY = (double) (0.42F + (float) this.getSize() * 0.1F);
        this.am = true;
    }

    protected void a(float f) {}

    protected boolean l() {
        return true;
    }

    protected int m() {
        return super.m() + 2;
    }

    protected String aZ() {
        return "mob.slime." + (this.getSize() > 1 ? "big" : "small");
    }

    protected String ba() {
        return "mob.slime." + (this.getSize() > 1 ? "big" : "small");
    }

    protected String n() {
        return this.getSize() > 1 ? "mob.magmacube.big" : "mob.magmacube.small";
    }

    public boolean J() {
        return false;
    }

    protected boolean o() {
        return true;
    }
}
