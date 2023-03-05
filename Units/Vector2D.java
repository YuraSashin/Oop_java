public class Vector2D {
    protected int x;
    protected int y;

    public Vector2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double Distance(Vector2D enemy){
        return Math.sqrt(Math.pow(x - enemy.x,2) + Math.pow(y - enemy.y,2));
    }

    protected boolean getLeft(Vector2D oponent){
        return oponent.x < x;
    }

    protected boolean getDown(Vector2D oponent){
        return oponent.y < y;
    }

    // public void SetPos(int posX, int posY){
    //     this.posX = posX;
    //     this.posY = posY;
    // }

    // public int GetPosX(){
    //     return posX;
    // }

    // public int GetPosY(){
    //     return posY;
    // }
}
