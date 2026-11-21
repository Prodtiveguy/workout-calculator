import java.util.ArrayList;
import java.util.List;

public class WorkoutLog {
    private List<WorkoutSession> sessions = new ArrayList<>();

    public void addSession(WorkoutSession session) {
        sessions.add(session);
    }

    public int getSize() {
        return sessions.size();
    }   

    public boolean isEmpty() {
        return sessions.isEmpty();
    }

    public WorkoutSession getSession(int number) {
        return sessions.get(number - 1);
    }

    public String getListText() {
        if (sessions.isEmpty()) {
            return "No workouts saved yet.";
        }
        String text = "";
        for (int i = 0; i < sessions.size(); i++) {
            text += (i + 1) + ". " + sessions.get(i).getDate() + "\n";
        }
        return text;
    }

}