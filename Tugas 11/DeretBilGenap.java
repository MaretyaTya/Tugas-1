class DeretBilGenap{
    static void deretGenap(int i) {     //membuat fungsi dengan nama deretGenap dan parameter (int i)
        if (i<=50) {                    //memberi syarat dengan ketentuan i<=20 terpenuhi akan melakukan statement dibawahnya
            System.out.print(i + " ");  //output nilai variable i
            deretGenap (i +=4);         //memanggil fungsi deretGenap dengan parameter i+=2
        }
    }

    public static void main(String[] args) {
        deretGenap (4);
    }
}