package br.com.meta.composite.orders;

class ProductLeaf extends ProductComponent {

    public ProductLeaf(final String name, final Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Double getTotal() {
        return this.price;
    }

}
