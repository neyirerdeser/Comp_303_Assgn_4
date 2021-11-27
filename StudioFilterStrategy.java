/*
 * Strategy to filter Movies, TVShows or Episodes whose publishing studio is equal to pPublishingStudio
 */
public class StudioFilterStrategy implements WatchListFilter {

    private final String aPublishingStudio;

    public StudioFilterStrategy(String pPublishingStudio) {
        aPublishingStudio = pPublishingStudio;
    }

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
        return pWatchable.getStudio().equals(aPublishingStudio);
    }
}
