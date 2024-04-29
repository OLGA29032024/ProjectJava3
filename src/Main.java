import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int fixedAmount = 1000;
        int replenishAmount = 3000;
        int totalAmount = initialAmount + replenishAmount;
        System.out.println("Итоговая сумма: " + totalAmount);
        int bonus = totalAmount / 100;
        int accountAmmount = initialAmount + replenishAmount;
        if (totalAmount < fixedAmount) {
            bonus = 0;
        }
        if (bonus > 0) {
            accountAmmount = initialAmount + replenishAmount + bonus;
        }
        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговая сумма на счету: " + accountAmmount);
    }
}
































