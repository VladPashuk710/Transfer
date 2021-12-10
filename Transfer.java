package test_task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class Transfer {

    @Autowired

    @PostMapping(value = "150$")

    @GetMapping(value = "150$")

    @TransferFromAccountToAccount (compareTo = 0, withdraw = 150, deposit = 150)

    private void transfer(BankAccount fromAccount, BankAccount toAccount, int transferAmount) {
        BankAccount fromAccountTemp = fromAccount;
        BankAccount toAccountTemp = toAccount;

        if (fromAccountTemp.compareTo(toAccountTemp) < 0) {
            fromAccountTemp = toAccountTemp;
            toAccountTemp = fromAccountTemp;
        }

        synchronized(fromAccountTemp){
            synchronized(toAccountTemp){
                fromAccount.withdraw(transferAmount);
                toAccount.deposit(transferAmount);
            }

        }

    }

}
