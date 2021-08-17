public class Main {
    public static void main(String[] args) {
        Worker[]workers={
                new Worker("Иван","Иванов","Иванов","Водитель",898712224,40000,49),
                new Worker("Николай","Николаев","Николаевич","Менеджер",784122577,36000,23),
                new Worker("Петр","Петров","Петрович","Менеджер",4455654,25000,46),
                new Worker("Мария","Ивановна","Ивановна","Секретарь",84512653,75000,49),
                new Worker("Сергей","Серевеной","Сергеевич","Директор",7412588,85000,65)
        };
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge()>=40){
                workers[i].getInfoWorker();
            }
        }
    }
}

