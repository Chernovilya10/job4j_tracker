package ru.job4j.oop.encapsulation;

public class Shop {
    public static void main(String[] args) {
//        Product[] products = new Product[5];
//        products[0] = new Product("Milk", 10);
//        products[1] = new Product("Bread", 4);
//        products[2] = new Product("Egg", 19);
//
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
//
//        System.out.println();
//        System.out.println("Удаляем значение из ячейки с индексом 1");
//        //удаляем значение из ячейки с индексом 1
//        products[1] = null;
//
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//        }
//
//        System.out.println();
//        System.out.println("Записываем  в ячейку с индексом 1 значение ячейки с индексом 2 и удаляем значение из ячейки с индексом 2");
//        //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
//        products[1] = products[2];
//        //удаляем значение из ячейки с индексом 2.
//        products[2] = null;
//        for (int i = 0; i < products.length; i++) {
//            Product product = products[i];
//            //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
//            if (product != null) {
//                System.out.println(product.getName());
//            } else {
//                System.out.println("null");
//            }
//
        Product[] products1 = new Product[5];
        products1[0] = new Product("Milk", 10);
        products1[1] = new Product("Bread", 4);
        products1[3] = new Product("Egg", 19);
        products1[4] = new Product("Melon", 6);
        for (int i = 0; i < products1.length; i++) {
            Product product = products1[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println(System.lineSeparator() + "Сдвигаем все элементы массива влево на одну позицию");
        Shop shop = new Shop();
        Product[] s = shop.delete(products1, 2);    //закидываем в метод массив и индекс последнего элемента
        for (Product pr : s) {
            if (pr != null) {
                System.out.println(pr.getName());
            } else {
                System.out.println("null");
            }
        }
    }

    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}