package Yang;

/**
 * Created by temp on 2/19/2016.
 */
public class Customer extends Person{

    private String customerNumber;

    public customerNumber() {
        customerNumber = "";
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(customerNumber) {
        this.customerNumber =  customerNumber;
    }

    public getDisplayText() {
        return super.toString() + "/n" + "Customer number: " + customerNumber;
    }
}
