import processing.core.PImage;

import java.util.List;

public class Obstacle extends Entity{

    public Obstacle(EntityKind kind, String id, Point position, List<PImage> images, int resourceLimit,
                 int resourceCount, double actionPeriod, double animationPeriod, int health, int healthLimit){
        super(kind, id, position, images, resourceLimit, resourceCount, actionPeriod, animationPeriod, health, healthLimit);
    }
}
