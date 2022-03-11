package Controls;

public class SideLightEvent {

    private final int id;

    public  SideLightEvent(int id){
        this.id = id;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ EventSideLight | ");
        stringBuilder.append("id = ").append(id).append(" }");
        return stringBuilder.toString();
    }
}
