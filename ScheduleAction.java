//implemented by DUDE, FAIRY, OBSTACLE, TREE, SAMPLING
//parent interface to ExecuteAction (execute activity method uses all methods here except Obstacle)
public interface ScheduleAction {
    public void scheduleActions(EventScheduler scheduler, WorldModel world, ImageStore imageStore);
}
