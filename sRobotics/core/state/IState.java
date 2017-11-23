package sRobotics.core.state;

public interface IState<T>
{
    void change(RobotContext robotContext , T value);
}
