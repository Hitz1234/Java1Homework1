package java1.homework;

public class Worker {
    private String FirstName;
    private String SecondName;
    private String Position;
    private String Email;
    private String PhoneNumber;
    private int Salary;
    private int Age;


    public Worker(String FirstName, String SecondName, String Position, String Email, String PhoneNumber, int Salary, int Age){
        this.FirstName = FirstName;
        this.SecondName = SecondName;
        this.Position = Position;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Age = Age;
    }

    public String toString(){
        return "Имя: " + this.FirstName + " Фамилия: " + this.SecondName + " Должность: " + this.Position +
                "\nEmail: " + this.Email + " Номер телефона: " + this.PhoneNumber + "\nЗарплата: " + this.Salary +
                " Возраст: " + this.Age +"\n";
    }
    public int getAge() {
        return Age;
    }

    public static void main(String[] args){
        Worker[] workers = new Worker[5];

        workers[0] = new Worker("Иван", "Иванов","Директор", "Ivanov@mail.ru",
                "89235150001", 100000, 55);
        workers[1] = new Worker("Мария", "Петрова","Бухгалтер", "Petrova@mail.ru",
                "89235150002", 50000, 23);
        workers[2] = new Worker("Коля", "Герасимов","Начальик отдела", "Gerasimov@mail.ru",
                "89235150003", 70000, 45);
        workers[3] = new Worker("Анатолий", "Кабанков","Специалист", "Kabankov@mail.ru",
                "89235150004", 50000, 37);
        workers[4] = new Worker("Евгений", "Лисицин","Специалист", "Lisicin@mail.ru",
                "89235150005", 50000, 25);
        for (Worker worker: workers){
            if (worker.getAge()>40)
                System.out.println(worker);
        }
    }
}
