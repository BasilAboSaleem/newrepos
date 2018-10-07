

package oop1;


public class BankAccount {
    
    private String accountNumber;
     private String holdarName;
     private float balanc;
     private String holdarId;
     private int accountType;
     private boolean isBlocked;
     private String bassworde;
     
     public BankAccount(String accountNumber){
         this.accountNumber=accountNumber;
     }

    BankAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
    public void setAccountNumber(String ac){
         
         accountNumber=ac;
     }
             
    public String getAccountNumber(){
         return accountNumber;

     }
     
    
    public boolean draw(float amount){
         if(!isIsBlocked() && getBalanc()>=amount ){
            setBalanc(getBalanc() - amount);
           return true;
       }else{
           return false;
       } 
        
    }
    
    
    
    public boolean deposit(float amount){
     if(!isIsBlocked()){
             setBalanc(getBalanc() + amount);
             return true;

            }else{
                return false;
            }   
         
    }

    /**
     * @return the holdarName
     */
    public String getHoldarName() {
        return holdarName;
    }

    /**
     * @param holdarName the holdarName to set
     */
    public void setHoldarName(String holdarName) {
        this.holdarName = holdarName;
    }

    /**
     * @return the balanc
     */
    public float getBalanc() {
        return balanc;
    }

    /**
     * @param balanc the balanc to set
     */
    public void setBalanc(float balanc) {
        this.balanc = balanc;
    }

    /**
     * @return the holdarId
     */
    public String getHoldarId() {
        return holdarId;
    }

    /**
     * @param holdarId the holdarId to set
     */
    public void setHoldarId(String holdarId) {
        this.holdarId = holdarId;
    }

    /**
     * @return the accountType
     */
    public int getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the isBlocked
     */
    public boolean isIsBlocked() {
        return isBlocked;
    }

    /**
     * @param isBlocked the isBlocked to set
     */
    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    /**
     * @return the bassworde
     */
    public String getBassworde() {
        return bassworde;
    }

    /**
     * @param bassworde the bassworde to set
     */
    public void setBassworde(String bassworde) {
        this.bassworde = bassworde;
    }
    
    
     
}
