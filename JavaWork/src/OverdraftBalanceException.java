public class OverdraftBalanceException extends RuntimeException{
    private String message;
    private double lessMoney;

    @Override
    public String getMessage() {
        return message;
    }

    public OverdraftBalanceException(double lessMoney, String message) {
        this.lessMoney = lessMoney;
        this.message = message;
    }

}
