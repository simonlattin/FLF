package Controls;

public class MotorEvent {

    private final int id;

    public MotorEvent(int id){
        this.id = id;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ EventMotor | ");
        stringBuilder.append("id = ").append(id).append(" }");
        return stringBuilder.toString();
    }
}
