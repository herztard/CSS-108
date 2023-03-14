public class Ball {
    float x;
    float y;
    int radius;
    float xDelta;
    float yDelta;

    Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;

    }

    float getX(){
        return this.x;
    }

    float getY(){
        return this.y;
    }

    int getRadius() {
        return this.radius;
    }

    float getXDelta() {
        return this.xDelta;
    }

    float getYDelta() {
        return this.yDelta;
    }

    void setX(float x) {
        this.x = x;
    }

    void setY(float y) {
        this.y = y;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    void move(){
        this.x += xDelta;
        this.y += yDelta;
    }
    void reflectHorizontal(){
        this.xDelta = -xDelta;
    }
    void reflectVertical(){
        this.yDelta = -yDelta;
    }

    @Override
    public String toString(){
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
