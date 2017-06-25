package lock;

class PUK extends Lock {

    @Override
    void setKey (int key) {

        int access = 88888888;

        if (key == access) {

            lockStatus = "Open";
        }
    }
}