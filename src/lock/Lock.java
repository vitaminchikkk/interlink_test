package lock;

class Lock {

    protected String lockStatus = "Close";

    void setKey (int key) {

        lockStatus = "Open";
    }

    String getLockStatus() {

        return lockStatus;
    }
}