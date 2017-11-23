package sRobotics.core.state;

public class ActivationState implements IState<ActivationStateType>
{
    private ActivationStateType activationState;

    public ActivationState() {
        this.activationState = ActivationStateType.off;
    }

    public ActivationStateType getActivationStateType() {
        return activationState;
    }

    @Override
    public void change(RobotContext robotContext, ActivationStateType value)
    {
        robotContext.getRobotCommands().getSayHello().Execute();
        activationState = value;
    }
}
