package br.com.meta.composite.orders;

class OrderClient {

    public static void main(String[] args) {

        final ProductComposite order = new ProductComposite("Pedido");

        final ProductLeaf itemOne = new ProductLeaf("coca-cola", 5.00);
        final ProductLeaf itemTwo = new ProductLeaf("fanta-laranja", 5.00);
        order.add(itemOne);
        order.add(itemTwo);

        final ProductComposite itemThree = new ProductComposite("caixa - leite fechada", 20.0);
        order.add(itemThree);

        final ProductLeaf itemFour = new ProductLeaf("Cerveja", 9.90);
        order.add(itemFour);

        System.out.println(order.print());

    }
}
