package footballscore;

import java.util.ArrayList;

public class FootBallScoreController implements SourceFootBallScore {
    private final ArrayList<FootBallObserver> list_data;
    private String input_data;

    public FootBallScoreController() {
        this.list_data = new ArrayList<FootBallObserver>();
    }

    public String getInput_data() {
        return input_data;
    }

    public void setInput_data(String input_data) {
        this.input_data = input_data;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (int i =0; i<list_data.size(); i++){
            list_data.get(i).update(this);
        }
    }

    @Override
    public void register(FootBallObserver footBallObserver) {
            list_data.add(footBallObserver);
    }
}
