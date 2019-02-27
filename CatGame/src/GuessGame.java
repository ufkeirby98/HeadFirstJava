public class GuessGame {
    Player p1, p2, p3;
    String[] catColor={"белый","серый","черный","рыжий","лысый"};
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        boolean p1_isRight = false;
        boolean p2_isRight = false;
        boolean p3_isRight = false;
        int targetNumber = (int) (Math.random() * 5);
        System.out.println("Загадываю цвет кота...");

        while(true){
            System.out.println("Наш кот = " + catColor[targetNumber]);
            p1.guess();
            p2.guess();
            p3.guess();
            System.out.println("Игрок 1 думает, что кот - " + catColor[p1.number]);
            System.out.println("Игрок 2 думает, что кот - " + catColor[p2.number]);
            System.out.println("Игрок 3 думает, что кот - " + catColor[p3.number]);
            if (p1.number == targetNumber){
                p1_isRight = true;
            }
            if (p2.number == targetNumber){
                p2_isRight = true;
            }
            if (p3.number == targetNumber){
                p3_isRight = true;
            }
            if (p1_isRight || p2_isRight || p3_isRight) {
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + ((p1_isRight) ? "Да" : "Нет"));
                System.out.println("Второй игрок угадал? " + ((p2_isRight) ? "Да" : "Нет"));
                System.out.println("Третий игрок угадал? " + ((p3_isRight) ? "Да" : "Нет"));
                System.out.println("Конец игры");
                break;
            }
            else{
                System.out.println("Никто не угадал, даю еще попытку!\n");
            }
        }
    }

}
