package Package1;

class Account { 
    //private data members to hide the data
    private long acc_no; 
    private String name,email; 
    private float amount; 
    //public getter and setter methods 
        public long getAcc_no() { 
            return acc_no; 
        } 
        public void setAcc_no(long acc_no) { 
            this.acc_no = acc_no; 
        } 
        public String getName() { 
            return name; 
        } 
        public void setName(String name) { 
            this.name = name; 
        } 
        public String getEmail() { 
            return email; 
        } 
        public void setEmail(String email) { 
            this.email = email; 
        } 
        public float getAmount() { 
            return amount; 
        } 
//        public void setAmount(float amount) { 
//            this.amount = amount; 
//        } 
        public void setDeposit(float amount) { 
            this.amount += amount; 
        } 
        public void setWithdraw(float amount) { 
            this.amount  -= amount; 
        } 

   
} 
public class BankEncaps {
    public static void main(String[] args) { 
        //creating instance of Account class 
        Account acc=new Account(); 
        //setting values through setter methods 
        acc.setAcc_no(7310805450L); 
        acc.setName("SHARVESH"); 
        acc.setEmail("abc123@gmail.com"); 
        //acc.setAmount(10000f); 

        //getting values through getter methods 
        System.out.println("ACCOUNT NUMBER: "+acc.getAcc_no());
        System.out.println("ACCOUNT HOLDER NAME: "+acc.getName());
        System.out.println("ACCOUNT HOLDER MAIL ID: "+acc.getEmail());
        System.out.println("ACCOUNT BALANCE: "+acc.getAmount()); 

        acc.setDeposit(5000f);
        System.out.println("ACCOUNT BALANCE: "+acc.getAmount()); 

        acc.setWithdraw(3000f);
        System.out.println("ACCOUNT BALANCE: "+acc.getAmount()); 
    } 
    
}
