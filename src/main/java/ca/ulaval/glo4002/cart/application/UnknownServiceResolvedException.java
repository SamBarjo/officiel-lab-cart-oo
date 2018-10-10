package ca.ulaval.glo4002.cart.application;

public class UnknownServiceResolvedException extends RuntimeException {
    public <T> UnknownServiceResolvedException(Class<T> contract) {
        super("No service was registered for contract " + contract.getSimpleName());
    }
}
