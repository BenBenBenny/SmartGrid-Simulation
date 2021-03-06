package policy.compositions;
import java.util.Stack;
import time.TimedEvent;
import household.HouseHold;
import java.util.ArrayList;
import policy.*;
/**Example of a composition of policy components in to a bigger more complex
 * policy
 *
 * @author Darius Hodaei <k1183257@kcl.ac.uk>
 */
public class Bachelor extends PolicyComposition{

    /**Creates a new Bachelor policy composition
     *
     * @param h Household which adopts this policy
     */
    public Bachelor(HouseHold h){
        super(h);
       pols.add(new ChilledWeekend(house));
       pols.add(new GreedyDinner(house));
       pols.add(new WorkingWeekPolicy(house));
       pols.add(new HouseCleaning(house));
       pols.add(new WatchMovie(house));
    }

}
