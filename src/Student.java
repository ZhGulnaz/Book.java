public class Student extends Person{
    private int id;
    private int age;
    private String name;
    private String surname;
    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    public void printStudents(int id, int age, String name, String surname, int buffer) {
        while (buffer == 0) {
            System.out.println("There is no student, add someone!");
        }
        System.out.println(getId() + " " + getAge() + " " + getName() + " " + getSurname());
    }
}
