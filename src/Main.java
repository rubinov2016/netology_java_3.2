public class Main {
    public static void main(String[] args) {
        float currentBalance;       //начальный баланс, руб
        float topUpCashAmount;      //сумма пополнения, руб

        currentBalance = 100.00F;  //тестовые данные. Можно менять для запуск программы
        topUpCashAmount = 1100.00F; //тестовые данные. Можно менять для запуск программы

        float minTopUp;             //минимальная сумма пополнения, с какой начисляется бонус, руб
        float rangeBonus;           //единица пополнения для расчета бонуса, руб
        float topUpBonus;           //количество бонусов за единицу пополнения, руб
        float finalBonus;           //количество начисленных
        minTopUp = 1000F;           //константы
        rangeBonus = 100F;          //константы
        topUpBonus = 1F;            //константы
        finalBonus = 0F;            //инициализация

        if (topUpCashAmount>minTopUp) finalBonus = (long)(topUpCashAmount/rangeBonus)*topUpBonus;
        currentBalance = currentBalance + topUpCashAmount + finalBonus;
        System.out.println(currentBalance);
        System.out.println(finalBonus);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}