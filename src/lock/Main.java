package lock;

class Main {

    private void protection() {

        EnterKey enterKey = new EnterKey();
        PIN pin = new PIN();
        PUK puk = new PUK();

        int i = 0;

        do {
            i++;

            pin.setKey(enterKey.getKey("PIN"));

            if (pin.getLockStatus() == "Close") {

                System.out.println("Wrong PIN");

            } else {

                System.out.print(pin.getLockStatus());
                break;
            }

            if (i == 3) {

                puk.setKey(enterKey.getKey("PUK"));
                System.out.print(puk.getLockStatus());
            }
        } while (i < 3);
    }
    public static void main(String[] args) {

        Main main = new Main();
        main.protection();
    }
}