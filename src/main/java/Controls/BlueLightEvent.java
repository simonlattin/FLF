package Controls;

public class BlueLightEvent {

    private final int id;

    public BlueLightEvent(int id){
        this.id = id;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ EventBlueLight | ");
        stringBuilder.append("id = ").append(id).append(" }");
        return stringBuilder.toString();
    }
}
