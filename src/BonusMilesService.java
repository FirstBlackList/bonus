public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int parameters = 20;//RUB
        int theAmountOfMiles = ticketPrice / parameters;

        return theAmountOfMiles;
    }

}
