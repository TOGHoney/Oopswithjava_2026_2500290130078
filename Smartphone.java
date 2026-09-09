abstract class Device{
    String brand = "Samsung"
    abstract void turnon();
    void showBrand(){
        System.out.println("Brand : "+ brand);
    }
}
interface Camera{
    int max_zoom = 10;
    void takePhoto();
    default void cameraInfo(){
        System.out.println("Zoom: "+ max_zoom);
    }
}
interface MusicSystem{
    String type  = "digital";
    void playmusic();
    default musicInfo(){
        System.out.println("Music player is ready")
    }
}

class Smartphone extends Device implements Camera, MusicSystem{
    void turnon(){
        System.out.println("Smartphone is turned on");
    }

    public void takePhoto(){
        System.out.println("Smartphone is taking photo");
    }
    
    void playMusic(){
        System.out.println("Playing music");
    }
}