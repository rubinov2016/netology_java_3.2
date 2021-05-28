public class Main {
    public static void main(String[] args) {
        float currentBalance = 100.00F;         //начальный баланс, руб
        float topUpCashAmount = 1100.00F;       //сумма пополнения клиентом, руб

        float minTopUp = 1000F;                 //минимальная сумма пополнения, с какой начисляется бонус, руб
        float rangeBonus = 100F;                //диапазон пополнения, в пределах которого бонус не меняется, руб
        long topUpBonus = 1;                    //количество бонусов за 1 диапазон пополнения, руб
        long finalBonus = 0;                    //итоговое количество начисленных бонусов клиенту, руб

        if (topUpCashAmount > minTopUp) finalBonus = (long) (topUpCashAmount / rangeBonus) * topUpBonus;
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