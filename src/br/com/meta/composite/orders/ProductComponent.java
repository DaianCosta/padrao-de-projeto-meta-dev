package br.com.meta.composite.orders;

abstract class ProductComponent {

    String name;
    Double price = 0.0;

    public abstract Double getTotal();

    public void add(final ProductComponent productComponent) {
        throw new UnsupportedOperationException("Feature is not implemented yet");
    }

    public void remove(final ProductComponent productComponent) {
        throw new UnsupportedOperationException("Feature is not implemented yet");
    }
}
