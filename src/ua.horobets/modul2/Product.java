package ua.horobets.modul2;


    class Product {
        String name;
        int quantity;
        double price;

        Product(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + "|" + quantity + "|" + price;
        }
       public double getPrice() {
            return price;
        }

    }

