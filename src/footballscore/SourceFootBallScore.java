package footballscore;

public interface SourceFootBallScore {
    public void notifyObservers();
    public void register(FootBallObserver footBallObserver);
}
