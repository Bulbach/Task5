package local.Store;

import local.Cars.Car;

public class Store<T extends Purchaseble> {

    int amountOfMoneyInBox;
    T[] productList;

    Store(int amountOfMoney, T[] productList) {
        this.productList = productList;
        this.amountOfMoneyInBox = amountOfMoney;
    }

    public void printProduct(T[] productList) {
        if (productList.length == 0) {
            System.out.println("Товара в магазине нет");
        } else {

            for (T t : productList) {
                System.out.println("название : " + t + t.getName() + "Цена :" + t.getPrice());
            }
        }
    }


    public void purchase(int index, int amountOfMoney) {

        if (index < productList.length) {
            if (amountOfMoney >= getPriceByIndex(index)) {
                amountOfMoneyInBox += getPriceByIndex(index);
                System.out.println("Спасибо что преобрели: " + productDelete(index));
            }else {
                System.out.println("У вас не хватает денег");
            }

        }
        else {
            System.out.println("Такого товара нет в списке");
        }

    }

    public void sell(T product, int cost){
        int commission = (int) (cost*0.1);
        int realPrice = product.getPrice() - commission;
        if (cost<= realPrice){
            if (cost<=amountOfMoneyInBox){
                amountOfMoneyInBox-=cost;
                productStand(product);
                System.out.println("Удачная сделка.");
            }
            else{
                System.out.println("Подождите до завтра пожалуйста");
            }
        }
        else{
            System.out.println("Это слишком дорого!");
        }
    }

    public T productDelete(int index) {
        int newSize = productList.length - 1;
        T[] temp = (T[]) new Purchaseble[newSize];
        T product = productList[index];
        for (int i = 0, t = 0; i <= temp.length; i++, t++) {
            if (t == index) {
                t--;
                continue;
            }


            temp[t] = productList[i];
        }

        productList = temp;
        return product;
    }

    public void productStand(T product) {
        int newSize = productList.length + 1;
        T[] temp = (T[]) new Purchaseble[newSize];

        for (int t = 0; t < productList.length; t++) {
            temp[t] = productList[t];
        }
        temp[productList.length] = product;
        productList = temp;
    }

    public int getAmountOfMoney() {
        return amountOfMoneyInBox;
    }

    public T[] getProductList() {
        return productList;
    }

    public String getNameByIndex(int index) {
        return productList[index].getName();
    }

    public int getPriceByIndex(int index) {
        return productList[index].getPrice();
    }
}
