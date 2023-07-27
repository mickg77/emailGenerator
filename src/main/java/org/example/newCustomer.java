package org.example;

public class newCustomer {

    //make variables private to ensure that other classes cannot change them
    public String firstname; //had to change to public to make it run
    public String lastname; //same as above
    public String password;
    public int mailbox;
    public String department;



    private String emailAddress;

    //create a constructor to recieve the first and last names as parameters
    public newCustomer(String firstname, String lastname) {
        this.firstname = firstname; //"this" refers to the Class level variable
        this.lastname = lastname;
        System.out.println("Email has been created for "+this.firstname+" "+this.lastname); //confirmation statement
        setDepartment(1);
        this.department= getDepartment();
        System.out.println(this.firstname+" "+this.lastname+" works in "+this.department);
        setPassword(8);
        System.out.println(getPassword());//creates password of 8 characters
        setMailbox(12);
        System.out.println(this.firstname+" "+this.lastname+"'s mailbox can hold "+getMailbox()+"MB of Data.");
        setEmailAddress();
        System.out.println(getEmailAddress()+" has been created.");

    }
    public void setDepartment(int choice){
        System.out.println("Enter the department of employee \n1 Computing\n2 Engineering\n3 None");
//        Scanner sc = new Scanner(System.in);
//        int choice = sc.nextInt();
        if(choice==1){
            this.department = "Computing";
        }
        else if(choice==2){
            this.department = "Engineering";
        }
        else{
            this.department = "General";
        }
    }

    public String getDepartment(){
        return this.department;
    }

    //Generate the random password
    public void setPassword(int length){

        char[] password = new char[length]; //create a blank array of 8 characters
        //myList is a string that characters can be randomly taken from
        String myList="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!%&*";
        for(int i=0;i<length;i++){//for loop runs to create a new password
            int rand= (int) (Math.random()*myList.length());//create a random number

            password[i]= myList.charAt(rand); //adds a character to the password, incrementing each time
        }
        this.password= new String(password);

    }

    public String getPassword(){
        return this.password;
    }

    //set the mailbox capacity

    public void setMailbox(int size){
        System.out.println("Enter the size of mailbox for "+this.firstname);
//        Scanner sc = new Scanner(System.in);
//        int size =sc.nextInt();
        this.mailbox=size;
    }

    public int getMailbox() {
        return this.mailbox;
    }
//change the password

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress() {
        this.emailAddress = this.firstname+"."+this.lastname+"@company.com";
    }

}


