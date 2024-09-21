public class Employee {
    Integer id;
    Integer phoneNumber;
    String name;
    Integer experience;

    public Employee(Integer id, Integer phoneNumber, String name, Integer experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    protected Integer getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ID=" + id +
                ", номер телефона=" + phoneNumber +
                ", имя='" + name + '\'' +
                ", стаж=" + experience +
                '}' + "\n";
    }

}
