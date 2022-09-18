public class TaxPay {
    boolean isMarried;
    int money;
    double tax;
    
    
    public TaxPay(boolean isMarried, int money) {
        this.isMarried = isMarried;
        this.money = money;
        if(!isMarried){
            if (money <= 8000){
                tax = money * 0.1;
            } else if (money > 8000 && money <= 32000) {
                tax = 800 + (money * 0.15);
            } else if (money > 32000) {
                tax = 4400 + (money * 0.25);
            }
        }
        else{
            if (money <= 16000){
                tax = money * 0.1;
            } else if (money > 16000 && money <= 64000) {
                tax = 1600 + (money * 0.15);
            } else if (money > 64000) {
                tax = 8800 + (money * 0.25);
            }
        }
    }

    public double getTax() {
        return tax;
    }

}
