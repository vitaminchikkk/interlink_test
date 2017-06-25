package lock;

class PIN extends Lock {

    @Override
    void setKey (int key) {

        int access = 4444;

        if (key == access) {

            lockStatus = "Open";
        }
    }
}