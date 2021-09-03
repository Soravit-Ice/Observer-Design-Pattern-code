package footballscore;

public class FootBallLiveScore2 implements FootBallObserver{
    @Override
    public void update(SourceFootBallScore sourceFootBallScore) {
        System.out.println("live result : " + ((FootBallScoreController) sourceFootBallScore).getInput_data());
    }
}
