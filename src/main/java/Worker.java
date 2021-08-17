public class Worker {
    private String name;
    private String surname;
    private String patronymic;
    private String position;
    private long telephone;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPosition() {
        return position;
    }

    public long getTelephone() {
        return telephone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Worker(String name, String surname, String patronymic, String position, long telephone, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfoWorker(){
        System.out.println("Имя "+name+" Фамилия "+surname+" Отчество "+patronymic+" Возраст "+age+" Должность "
                +position+" Телефон "+telephone+" Зарплата "+salary);
    }
}
