package People;

import Transactions.Exchange;
import Transactions.Swap;
import Transactions.Transfer;

public class User extends Person implements Exchange, Swap, Transfer {

    public User(String username, String password, String firstName, String lastName, String email, String phoneNumber) {
        super(username, password, firstName, lastName, email, phoneNumber);
    }

    @Override
    public void exchange() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void swap() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void transfer() {
        // TODO Auto-generated method stub
        
    }
    
}
