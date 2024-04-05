package data;

public class Coordinates {
    private long x;
    private Long y; //Максимальное значение поля: 581, Поле не может быть null

    public Coordinates(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public void setX(long x){
        this.x = x;
    }
    public void setY(long y){
        this.y = y;
    }
    public int getVektor(long x, long y){
        return Integer.parseInt(String.valueOf(Math.sqrt(x^2 + y^2)));
    }
}
