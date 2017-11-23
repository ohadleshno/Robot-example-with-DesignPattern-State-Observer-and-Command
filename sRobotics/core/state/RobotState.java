package sRobotics.core.state;


import java.awt.*;

public abstract class RobotState
{
    public RobotState()
    {
        activationState = new ActivationState();
        locationState = new Point(0,0);
    }

    protected ActivationState activationState;
    protected Point locationState;

    public void changeLocationState(int x,int y)
    {
        locationState.move(x,y);
    }

    public ActivationState getActivationState() {
        return activationState;
    }
}
