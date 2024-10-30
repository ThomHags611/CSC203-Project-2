public class Activity extends Action {

    public Activity(Entity entity, WorldModel world, ImageStore imageStore, int repeatCount) {
        super(entity, world, imageStore, repeatCount);
    }


    public void executeAction(EventScheduler scheduler) {
        switch (this.entity.getKind()) {
            case SAPLING -> this.entity.executeSaplingActivity(this.world, this.imageStore, scheduler);
            case TREE -> this.entity.executeTreeActivity(this.world, this.imageStore, scheduler);
            case FAIRY -> this.entity.executeFairyActivity(this.world, this.imageStore, scheduler);
            case DUDE_NOT_FULL -> this.entity.executeDudeNotFullActivity(this.world, this.imageStore, scheduler);
            case DUDE_FULL -> this.entity.executeDudeFullActivity(this.world, this.imageStore, scheduler);
            default ->
                    throw new UnsupportedOperationException(String.format("executeActivityAction not supported for %s", this.entity.getKind()));
        }
    }
}
