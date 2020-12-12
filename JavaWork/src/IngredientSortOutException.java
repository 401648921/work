public class IngredientSortOutException extends RuntimeException {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public IngredientSortOutException(String message) {
        this.message = message;
    }
}
