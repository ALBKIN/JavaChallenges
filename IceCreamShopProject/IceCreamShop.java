package IceCreamShopProject;

import java.util.Scanner;

class ShopItems {
    int totalCount;

    class NonVegan {
        int iceCreamCount;
        int shakeCount;
        int totalCount;

        public void increseCount(int type, int count) {
            if (type == 1) {
                iceCreamCount += count;
            } else if (type == 2) {
                shakeCount += count;
            }
            totalCount = iceCreamCount + shakeCount;
            ShopItems.this.totalCount += shakeCount;
        }
    }

    class Vegan {
        int smoothieCount;
        int slushieCount;
        int totalCount;

        public void increseCount(int type, int count) {
            if (type == 3) {
                smoothieCount += count;
            } else if (type == 4) {
                slushieCount += count;
            }
            totalCount = smoothieCount + slushieCount;
            ShopItems.this.totalCount += slushieCount;
        }
    }
}

public class IceCreamShop {

    public static void main(String[] args) {
        ShopItems items = new ShopItems();
        ShopItems.Vegan vegan = items.new Vegan();
        ShopItems.NonVegan nonVegan = items.new NonVegan();

        int orderType = 0;
        Scanner input = new Scanner(System.in);
        int itemCount = 0;
        String itemName;

        System.out.println("Hello! Welcome to the ice cream shop. We are ready to take your order. \nFor ice-cream type 1, " +
                "\nfor shakes type 2, \nfor smoothies type 3, and \nfor slushies type 4. \n\nIf you are done ordering type 0.");
        orderType = input.nextInt();

        while (orderType != 0) {
            System.out.println("How many items of this item would you like to order?");
            itemCount = input.nextInt();
            if (orderType == 1) {
                itemName = "ice cream";
                nonVegan.increseCount(1, itemCount);
            } else if (orderType == 2) {
                itemName = "shake";
                nonVegan.increseCount(2, itemCount);
            } else if (orderType == 3) {
                itemName = "smoothie";
                vegan.increseCount(3, itemCount);
            } else if (orderType == 4) {
                itemName = "slushie";
                vegan.increseCount(4, itemCount);
            } else {
                break;
            }

            System.out.println("Adding " + itemCount + " of the item " + itemName + " to your order!");
            System.out.println("Type a number for the next item in your order:\n1: Ice Cream\n2: Shake\n3:" +
                    " Smoothie\n4: Slushie\n0: GO TO COUNTER");
            orderType = input.nextInt();
        }

        int totalOrders = nonVegan.totalCount + vegan.totalCount;

        System.out.println("Thank you for your order! Today we have sold " + totalOrders + " orders of sweetness!");
        System.out.println(nonVegan.totalCount + " items have been ice cream and shakes.");
        System.out.println(vegan.totalCount + " items have been smoothies and slushies.");
    }
}
