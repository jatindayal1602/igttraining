package day3_day4_oops;

// Abstract class representing a Bank
interface I {
 
    void card();
    
}

abstract class Bank {
    protected String bankName;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Abstract method (implemented by subclasses)
    abstract double getInterestRate();

    // Concrete method (common to all banks)
    public void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + getInterestRate() + "%");
    }
}

// Concrete class for SBI (inherits from Bank)
class SBI extends Bank {
    public SBI() {
        super("State Bank of India (SBI)");
    }

    // Implementing abstract method
    @Override
    double getInterestRate() {
        return 5.5; // SBI's interest rate
    }
}

// Concrete class for HDFC (inherits from Bank)
class HDFC extends Bank implements I {
    public HDFC() {
        super("HDFC Bank");
    }
    

    // Implementing abstract method
    @Override
    double getInterestRate() {
        return 6.2; // HDFC's interest rate
    }


    @Override
    public void card() {
       System.out.println("card accepted");
    }
}

// Main class to test the abstraction
public class Demo1 {
    public static void main(String[] args) {
        // Creating objects of SBI and HDFC using the abstract class reference
        Bank sbiBank = new SBI();
        Bank hdfcBank = new HDFC();

        // Displaying bank details
        sbiBank.displayBankInfo();
        System.out.println();
        hdfcBank.displayBankInfo();
      
        
    }
}
