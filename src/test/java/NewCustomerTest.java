import org.example.newCustomer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewCustomerTest {

    @Test
    public void testNewCustomer() {
        newCustomer customer = new newCustomer("Dwight", "Schrute");
        assertEquals("Dwight", customer.firstname);//wouldn't work so had to make firstname public
        assertEquals("Schrute", customer.lastname);
    }
    @Test
    public void testSetAndGetDepartment() {
        newCustomer customer = new newCustomer("Dwight", "Schrute");
        customer.setDepartment(1);
        assertEquals("Computing", customer.getDepartment());
        customer.setDepartment(2);
        assertEquals("Engineering", customer.getDepartment());
        customer.setDepartment(3);
        assertEquals("General", customer.getDepartment());
    }
    @Test
    public void testSetAndGetPassword() {
        newCustomer customer = new newCustomer("Dwight", "Schrute");
        customer.setPassword(8);
        assertEquals(8, customer.getPassword().length());
    }

    @Test
    public void testSetAndGetEmailAddress() {
        newCustomer customer = new newCustomer("Dwight", "Schrute");
        customer.setEmailAddress();
        assertEquals("Dwight.Schrute@company.com", customer.getEmailAddress());
    }
    @Test
    public void testSetAndGetEmailSize(){
        newCustomer customer = new newCustomer("Dwight", "Schrute");
        customer.setMailbox(12);
        assertEquals(12,customer.getMailbox());
    }


}

