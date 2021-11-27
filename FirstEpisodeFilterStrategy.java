/*
 * Strategy to filter Episodes which are the first episodes of the show they belong to
 */
public class FirstEpisodeFilterStrategy implements WatchListFilter{

    /**
     * Indicates whether a Watchable elements should be included in the watchlist.
     *
     * @param pWatchable
     *            a Watchable to potentially include in the Watchlist
     * @pre pWatchable != null
     * @return true if the Watchable must be included, false otherwise
     */
    @Override
    public boolean filter(Watchable pWatchable) {
        assert pWatchable != null;
        return pWatchable instanceof Episode && ((Episode) pWatchable).getEpisodeNumber()==1;
    }

}
