import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
        for(int i = 4; i>0; i--){
            System.out.println("ООО! МОЯ ОБОРОНА!");
            System.out.println(generatePhrase());
        }
    }
    private static String generatePhrase() {
        String[] wordListOne = {"Солнечный", "Траурный", "Плюшевый", "Бешеный", "Памятный",
                "Трепетный", "Базовый", "Скошенный", "Преданный", "Ласковый", "Пойманный", "Радужный",
                "Огненный", "Радостный", "Тензорный", "Шёлковый", "Пепельный", "Ламповый", "Жареный",
                "Загнанный"};
        String[] wordListTwo = {"зайчик", "Тишик", "глобус", "ветер", "щавель", "пёсик", "копчик",
                "ландыш", "стольник", "мальчик", "дольщик", "гномик", "невод", "егерь", "пончик", "лобстер",
                "жемчуг", "йогурт", "овод", "Мишик"};
        String[] wordListThree = { "стеклянного", "ванильного", "резонного", "широкого", "дешёвого",
                "горбатого", "собачьего", "исконного", "волшебного", "картонного", "лохматого", "арбузного",
                "огромного", "запойного", "великого", "бараньего", "вандального", "едрёного", "парадного",
                "укромного"};
        String[] wordListFour = {"глаза", "плова", "Пельша", "мира", "деда", "жира", "мема", "ада",
                "бура", "жала", "неба", "гунна", "хлама", "шума", "воза", "сала", "фена", "зала", "рака"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        int fourLength = wordListFour.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        int rand4 = (int) (Math.random() * fourLength);
        return wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] + " " + wordListFour[rand4]+ "\n";

    }
}
