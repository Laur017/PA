public class Room {
    private String name;
    private Integer capacity;
    private String type;

    public Room(String name, Integer capacity, String type)
    {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        System.out.println(this);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getCapacity()
    {
        return capacity;
    }

    public void setCapacity(Integer capacity)
    {
        this.capacity = capacity;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "Room{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
