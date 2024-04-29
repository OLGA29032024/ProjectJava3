import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialamount = 100;
        int fixedamount = 1000;
        int replenishamount = 950;
        int totalamount = initialamount + replenishamount;
        System.out.println("Итоговая сумма: " + totalamount);
        int bonus = totalamount / 100;
        int accountammount = initialamount + replenishamount;
        if (totalamount < fixedamount) {
            bonus = 0;
        }
        if (bonus > 0) {
            accountammount = initialamount + replenishamount + bonus;
        }
        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговая сумма на счету: " + accountammount);
    }
}
































