public class Tilang{ 
    public static void main(String[] args) {
        boolean Pelanggaran=true,
                SIM=false,
                STNK=true;

        if(SIM==true){
            if(STNK==true){    
                if(Pelanggaran==true){
                    System.out.println("Tidak Ditilang");    
                    }
                else{
                    System.out.println("Anda Ditilang");
                }
           
            }
            else{
                System.out.println("Anda Ditilang");
            }

        }  

        else{
                System.out.println("Anda Ditilang");
        }
    }
}