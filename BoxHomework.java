public class BoxHomework {

    public static void main(String[] args) {
        BoxHomework boxHomework = new BoxHomework(5,4,6);
        boxHomework.print();
        int width = boxHomework.width;
        int height = boxHomework.height;
        int lenght = boxHomework.length;
        System.out.println("Width: " + width + "; Height: " + height + "; Length: "+ lenght);

    }
    private int width;
    private int height;
    private int length;


    public BoxHomework (int width, int height, int length) {
       this.width = 5;
       this.height = 4;
       this.length = 6;
    }
    public void print(){
        System.out.println("Volume = " + width * height * length);
    }


}