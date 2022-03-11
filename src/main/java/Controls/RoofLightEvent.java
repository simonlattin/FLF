package Controls;

public class RoofLightEvent {

    private final int id;

    public  RoofLightEvent(int id){
        this.id = id;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ EventRoofLight | ");
        stringBuilder.append("id = ").append(id).append(" }");
        return stringBuilder.toString();
    }
}
