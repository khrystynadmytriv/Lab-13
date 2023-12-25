package ucu.edu.ua.task2;

public class Auth extends Авторизація {
    public boolean auth(DataBase db) {
        db.recieveStaticData();
        return true;
    }
}
