import Models.Account;

public class MainClass {
    public static void main(String[] args) {
        Account igor = new Account("Ігор", 1, 4, 1988, "igor@gmail.com",
                559631422L, "Бар", 85, 120, 10000);
        Account olga = new Account("Ольга", 15, 11, 1987, "olga@gmail.com",
                579134425L, "Барабуля", 55, 110, 15000);
        Account petro = new Account("Петро", 27, 12, 1985, "petro@gmail.com",
                651637431L, "Бондар", 125, 140, 6000);
        Account artem = new Account("Артем", 5, 8, 1957, "artem@gmail.com",
                477534625L, "Парок", 99, 170, 1000);
        Account bogdan = new Account("Богдан", 2, 1, 1999, "bogdan@gmail.com",
                651637431L, "Козинчук", 60, 100, 20000);
        igor.printAccountInfo();
        olga.printAccountInfo();
        petro.printAccountInfo();
        artem.printAccountInfo();
        bogdan.printAccountInfo();
        igor.setPressure(135);
        igor.setWeight(90);
        igor.setNumberOfStepsTakenPerDay(8500);
        igor.printAccountInfo();
        olga.setSurname("Толока");
        olga.setWeight(58);
        olga.setPressure(120);
        olga.setNumberOfStepsTakenPerDay(14000);
        olga.printAccountInfo();
    }
}
