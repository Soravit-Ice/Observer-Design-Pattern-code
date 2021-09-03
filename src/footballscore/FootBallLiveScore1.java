package footballscore;

public class FootBallLiveScore1 implements FootBallObserver{
    @Override
    public void update(SourceFootBallScore sourceFootBallScore) {
        System.out.println("live result : " + ((FootBallScoreController) sourceFootBallScore).getInput_data()) ;
    }
}
