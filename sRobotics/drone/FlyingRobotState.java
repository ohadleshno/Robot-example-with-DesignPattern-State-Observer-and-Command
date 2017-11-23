package sRobotics.drone;

import sRobotics.core.state.RobotState;

public class FlyingRobotState extends RobotState {
    private int flyingHeight;

    public FlyingRobotState() {
        flyingHeight = 0;
    }

    public void changeFlyingHeight(int flyingHeight) {
        this.flyingHeight = flyingHeight;
    }
}
