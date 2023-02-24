public class Vector2D {
    protected int x;
    protected int y;

    public Vector2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static double Distance(Characters u1, Characters u2){
        return Math.sqrt((u1.pos.x - u2.pos.x)^2 + (u1.pos.y - u2.pos.y)^2);
      };

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
