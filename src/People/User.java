package People;

import Transactions.Exchange;
import Transactions.Swap;
import Transactions.Transfer;

public class User extends Person implements Exchange, Swap, Transfer {
}
