package data;

public class Coordinates {
    private long x;
    private Long y; //Максимальное значение поля: 581, Поле не может быть null

    /**
     * Конструктор координат
     * @param x x
     * @param y y
     */
    public Coordinates(long x, long y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод для получения x
     * @return x
     */
    public long getX() {
        return x;
    }
    /**
     * Метод для получения y
     * @return y
     */

    public long getY() {
        return y;
    }

    /**
     * Метод для установки x
     * @param x x
     */

    public void setX(long x){
        this.x = x;
    }
    /**
     * Метод для установки y
     * @param y y
     */
    public void setY(long y){
        this.y = y;
    }
    /**
     * Метод для получения вектора
     * @return вектор
     */
    public int getVektor(long x, long y){
        return Integer.parseInt(String.valueOf(Math.sqrt(x^2 + y^2)));
    }
}
