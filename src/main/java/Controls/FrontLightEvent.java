package Controls;

public class FrontLightEvent {

    private final int id;

    public FrontLightEvent(int id){
        this.id = id;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ EventFrontLight | ");
        stringBuilder.append("id = ").append(id).append(" }");
        return stringBuilder.toString();
    }
}
