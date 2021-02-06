package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Марк");
        User user2 = new User("Артём");
        User user3 = new User("Валерия");

        user1.sendMessage(user2, "Привет, Артём.");
        user1.sendMessage(user2, "Будь добр, попроси Валю написать мне, чтобы мы добавились друг другу в контакты");

        user2.sendMessage(user1, "Даров, Марк.");
        user2.sendMessage(user1, "Конечно, не вопрос.");
        user2.sendMessage(user1, "Есть, написал.");

        user3.sendMessage(user1, "Здравствуй, Марк!");
        user3.sendMessage(user1, "Тёма написал мне");
        user3.subscribe(user1);
        user3.sendMessage(user1, "Отправила запрос в друзья");

        user1.sendMessage(user3, "И тебе не хворать, Валя");
        user1.subscribe(user3);
        user1.sendMessage(user3, "ответно подписался.");
        user1.sendMessage(user3, "Го гулять завтра вечером.");

        user3.sendMessage(user1, "Го");

        MessageDatabase.showDialog(user1,user3);


    }
}
