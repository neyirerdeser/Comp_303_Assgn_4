import java.util.ArrayList;
import java.util.List;

public class AND implements WatchListFilter{

    List<WatchListFilter> aFilters = new ArrayList<>();

    /**
     * Creates a composite filter consisting of two filters
     * @param pFilter1 one of the filters to be used in the composite filter
     * @param pFilter2 one of the filters to be used in the composite filter
     */
    public AND(WatchListFilter pFilter1, WatchListFilter pFilter2) {
        aFilters.add(pFilter1);
        aFilters.add(pFilter2);
    }

    /**
     * Used to add additional filters to the composite filter on top the two initial ones
     * @param pFilter filter to be added into consideration
     */
    public void addFilter(WatchListFilter pFilter) {
        aFilters.add(pFilter);
    }

    @Override
    public boolean filter(Watchable pWatchable) {
        for(WatchListFilter aFilter : aFilters)
            if(!aFilter.filter(pWatchable))
                return false;
        return true;
    }

}
