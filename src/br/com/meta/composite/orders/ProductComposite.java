package br.com.meta.composite.orders;

import java.util.ArrayList;
import java.util.List;

class ProductComposite extends ProductComponent {

    final List<ProductComponent> children = new ArrayList<>();

    public ProductComposite(final String name, final Double price) {
        this.name = name;
        this.price = price;
    }

    public ProductComposite(final String name) {
        this.name = name;
    }

    @Override
    public Double getTotal() {
        return Double.sum(price, children.stream()
                .mapToDouble(ProductComponent::getTotal).reduce(0, Double::sum));
    }

    @Override
    public void add(final ProductComponent productComponent) {
        children.add(productComponent);
    }

    @Override
    public void remove(final ProductComponent productComponent) {
        children.remove(productComponent);
    }

    public String print() {
        final StringBuilder builder = new StringBuilder(name);

        for (ProductComponent item :
                children) {
            builder.append("Name: ");
            builder.append(item.name);
            builder.append("\n");
            builder.append("Valor:");
            builder.append(item.getTotal());
            builder.append("\n");
        }
        builder.append("\n");
        builder.append("======> Total: <======");
        builder.append("\n");
        builder.append(getTotal());
        return builder.toString();
    }
}
