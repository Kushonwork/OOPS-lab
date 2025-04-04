interface EventHandler {
    void handleEvent();
}

class EventManager {
    public void registerEvent() {
        // Local inner class
        class LocalInnerEventHandler implements EventHandler {
            public void handleEvent() {
                System.out.println("Event handled by local inner class");
            }
        }

        LocalInnerEventHandler localHandler = new LocalInnerEventHandler();
        localHandler.handleEvent();
    }

    public void anonymousEventHandler() {
        // Anonymous inner class
        EventHandler anonymousHandler = new EventHandler() {
            public void handleEvent() {
                System.out.println("Event handled by anonymous inner class");
            }
        };

        anonymousHandler.handleEvent();
    }

    public static void main(String[] args) {
        EventManager manager = new EventManager();
        manager.registerEvent();
        manager.anonymousEventHandler();
    }
}