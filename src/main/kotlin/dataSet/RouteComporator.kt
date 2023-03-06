package dataSet

/**
 * RouteComporator.
 *
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */

class RouteComporator: Comparator<Route> {
    override fun compare(s1: Route, s2: Route): Int {
        if (s1.id < s2.id)
            return 1;
        else if (s1.id > s2.id)
            return -1;
        return 0;
    }
}