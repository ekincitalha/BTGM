class Preferences {
    // static değişkenimiz singleton class’ımızın instance’ı
    private static Preferences instance = null;


    // synchronized anahtarını ekleyerek her thread’in bir sonrakini beklemesini sağladık , aynı anda 2 thread bu methodu kullanamaz.
    private static void createInstance() {
        if (instance == null) instance = new Preferences();
    }

    public static Preferences getInstance() {
        if (instance == null) createInstance();
        return instance;
    }

    public void helloSingleton() {
        System.out.println("deneme1");
    }
}