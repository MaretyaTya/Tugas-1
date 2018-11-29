class test{

    static void beriUcapan(String ucapan){
        System.out.println(ucapan);
       }

    static void beri_salam(){
        System.out.println("Hello World!!");
    }

    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
       }

    public static void main(String[] args) {
        beri_salam();
        beriUcapan("Hello World!!!!");
        System.out.println(luasPersegi(5)); 
    }
}