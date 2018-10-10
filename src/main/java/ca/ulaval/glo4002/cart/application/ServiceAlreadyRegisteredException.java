package ca.ulaval.glo4002.cart.application;

public class ServiceAlreadyRegisteredException extends RuntimeException {

    public <T> ServiceAlreadyRegisteredException(Class<T> contract) {
        super("Service already registered for " + contract.getSimpleName());
    }
}
