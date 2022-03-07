public class Compulsory {
    public static void main(String[] args) {
        initAllEvents();
        initAllRooms();
    }

    private static void initEvent(String name, Integer size, Integer start, Integer end)
    {
        new Event(name, size, start, end);
    }

    private static void initRoom(String name, Integer capacity, String type)
    {
        new Room(name, capacity, type);
    }

    private static void initAllEvents()
    {
        initEvent("C1", 100, 8, 10);
        initEvent("C2", 100, 10, 12);
        initEvent("L1", 30, 8, 10);
        initEvent("L2", 30, 8, 10);
        initEvent("L3", 30, 10, 12);
    }

    private static void initAllRooms()
    {
        initRoom("401", 30, "lab");
        initRoom("403", 30, "lab");
        initRoom("405", 30, "lab");
        initRoom("309", 100, "lecture hall");
    }

    }

