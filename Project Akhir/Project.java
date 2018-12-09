import java.util.Scanner;
class Project{
        
        static Scanner sc=new Scanner(System.in);
        static char ulangi;

            public static void TampilkanMenu(){
                System.out.println("=====================================================================================================");
                System.out.println("===================================   Aplikasi Penghitung Zakat   ===================================");
                System.out.println("                                        1. Zakat Penghasilan");
                System.out.println("                                        2. Zakat Perdagangan");
                System.out.println("                                        3. Zakat Emas");
                System.out.println("                                        4. Zakat Tabungan");
                System.out.print("                                    Pilih Zakat yang ingin Hitung = ");
                int pilihan=sc.nextInt();
                System.out.println("=====================================================================================================");
                System.out.println("=====================================================================================================");
                System.out.println();
                System.out.println();
                if(pilihan == 1){
                    System.out.println();
                    System.out.println();
                    ZakatPenghasilan();
                    Ulangi();
                }
                else if(pilihan == 2){
                    System.out.println();
                    System.out.println();
                    ZakatPerdagangan();
                    Ulangi();
                }
                else if(pilihan == 3){
                    System.out.println();
                    System.out.println();
                    ZakatEmas();
                    Ulangi();
                }
                else if(pilihan == 4){
                    System.out.println();
                    System.out.println();
                    ZakatTabungan();
                    Ulangi();
                }
                else{
                    System.out.println();
                    System.out.println();
                    System.out.println("Pilih nomer yang tertera di Menu!!");
                    TampilkanMenu();
                }
            }
            
            public static void ZakatPenghasilan(){
        
                System.out.println("===================================   Zakat Penghasilan  ============================================");
                System.out.print("Masukan Jumlah Penghasilan Per Bulan = ");
                int penghasilan=sc.nextInt();
                System.out.print("Tambahan Penghasilan Dalam Sebulan (Bonus,Lembur,dll)= ");
                int bonus=sc.nextInt();
                System.out.print("Masukan Jumlah Pengeluaran Untuk Makan dalam Sebulan = ");
                int pengeluaran_makan=sc.nextInt();
                System.out.print("Masukan Jumlah Biaya Listrik anda dalam Sebulan = ");
                int pengeluaran_Listrik=sc.nextInt();
                System.out.print("Masukan Jumlah Biaya PDAM anda dalam Sebulan = ");
                int pengeluaran_PDAM=sc.nextInt();
                System.out.print("Masukan Jumlah Biaya BBM anda dalam Sebulan = ");
                int pengeluaran_BBM=sc.nextInt();
                System.out.print("Masukan Jumlah Pengeluaran untuk Cicilan bulanan anda (kredit motor, rumah ,dll) = ");
                int pengeluaran_Cicilan=sc.nextInt();
                System.out.print("Pengeluaran Lain-Lain (Asuransi, Biaya Kontrak Rumah, Biaya Kost Bulanan, dll = )");
                int pengeluaran_lain=sc.nextInt();
                int total=penghasilan+bonus-pengeluaran_makan-pengeluaran_Listrik-pengeluaran_PDAM-pengeluaran_BBM-pengeluaran_Cicilan-pengeluaran_lain;
                System.out.println("Saat Penghasilan Bersih anda bernilai 6.500.000 per bulan, anda wajib melaksanakan Zakat");
                System.out.println("=====================================================================================================");
                    if(total>=6500000){
                        int jumlah_zakat=total*25/1000;
                        System.out.println("=====================================================================================================");
                        System.out.println("Penghasilan Bersih Anda = RP " + total);
                        System.out.println("Saat Penghasilan Bersih anda bernilai 6.500.000 atau lebih dalam sebulan bulan, anda wajib melaksanakan Zakat");
                        System.out.println("Jumlah yang harus anda Zakat kan : " + jumlah_zakat);
                        System.out.println("=====================================================================================================");
                    }
                    else{
                        System.out.println("=====================================================================================================");
                        System.out.println("Penghasilan Bersih Anda = RP " + total);
                        System.out.println("Anda tidak Wajib Membayar Zakat");
                        System.out.println("=====================================================================================================");
                    }
            }

            public static void ZakatPerdagangan(){
                System.out.println("=====================================================================================================");
                System.out.println("===================================   Zakat Perdagangan  ============================================");
                System.out.println("");
                System.out.println("Saat Total Keuntungan Dagang anda bernilai setara 85gr emas (RP 49.594.483), anda wajib melaksanakan Zakat");
                System.out.println("");
                System.out.print("Masukan Jumlah Total Modal yang diputar Selama 1 Tahun = ");
                int modal=sc.nextInt();
                System.out.print("Masukan Total Keuntungan Selama 1 Tahun = ");
                int keuntungan=sc.nextInt();
                System.out.print("Masukan Total Kerugian Selama 1 Tahun = ");
                int kerugian=sc.nextInt();
                System.out.print("Masukan Jumlah Hutang yang dapat anda Cairkan = ");
                int hutangcair=sc.nextInt();
                System.out.print("Masukan Jumlah Hutang Anda = ");
                int hutang=sc.nextInt();
                System.out.print("Apakah anda sudah memegang total keuntungan selama 1 Tahun? (1 = yes / 2 = no) = ");
                int haul=sc.nextInt();
                int total=modal+keuntungan+hutangcair-hutang-kerugian;
                System.out.println("=====================================================================================================");
                    if(total>=49594483 && haul==1){ 
                        int jumlah_zakat=total*25/1000;
                        System.out.println("=====================================================================================================");
                        System.out.println("Anda Wajib Membayar Zakat");
                        System.out.println("Jumlah yang harus anda Zakat kan : " + jumlah_zakat);
                        System.out.println("=====================================================================================================");
                    }
                    else{
                        System.out.println("=====================================================================================================");
                        System.out.println("Total Keuntungan Dagang anda dalam Setahun adalah = RP " + total);
                        System.out.println("Anda tidak Wajib Membayar Zakat");
                        System.out.println("=====================================================================================================");
                    }

            }

            public static void ZakatEmas(){
                System.out.println("=====================================================================================================");
                System.out.println("===================================   Zakat Emas  =================================================");
                System.out.println("");
                System.out.println("Saat Total Jumlah Emas anda setara atau lebih dari 85gr emas, anda wajib melaksanakan Zakat");
                System.out.println("");
                System.out.print("Masukan Jumlah Emas yang anda miliki (dalam satuan gram) = ");
                int emas=sc.nextInt();
                System.out.print("Apakah anda sudah memegang harta ini selama 1 Tahun? (1 = yes / 2 = no) = ");
                int haul=sc.nextInt();
                int harga_emas=emas*583465;
                System.out.println("=====================================================================================================");
                    if(emas>=85 && haul==1){
                        System.out.println("Harga Emas saat ini (per gram) = RP 583.465");
                        System.out.println("Emas anda bernilai = RP " + harga_emas);
                        double jumlah_zakat_emas=emas*0.025;
                        double jumlah_zakat=jumlah_zakat_emas*583465;
                        System.out.println("=====================================================================================================");
                        System.out.println("Anda Wajib Membayar Zakat");
                        System.out.println("Jumlah yang harus anda Zakat kan Sebesar : " + jumlah_zakat);
                        System.out.println("=====================================================================================================");
                    }
                    else{
                        System.out.println("=====================================================================================================");
                        System.out.println("Total Nilai dari Emas anda adalah = RP " + harga_emas);
                        System.out.println("Anda tidak Wajib Membayar Zakat");
                        System.out.println("=====================================================================================================");
                    }
                
            }   
            
            public static void ZakatTabungan(){
                    System.out.println("=====================================================================================================");
                    System.out.println("===================================   Zakat Tabungan  ==============================================");
                    System.out.println("");
                    System.out.println("Saat Total Jumlah Tabungan anda setara dengan 85gr emas (RP 49.594.483), anda wajib melaksanakan Zakat");
                    System.out.println("");
                    System.out.print("Masukan Total Jumlah Tabungan yang anda miliki = ");
                    int tabungan=sc.nextInt();
                    System.out.print("Apakah anda sudah memegang harta ini selama 1 Tahun? (1 = yes / 2 = no) = ");
                    int haul=sc.nextInt();
                    System.out.println("=====================================================================================================");
                        if(tabungan>=49594483 && haul==1){
                            int jumlah_zakat=tabungan*25/1000;
                            System.out.println("=====================================================================================================");
                            System.out.println("Anda Wajib Membayar Zakat");
                            System.out.println("Jumlah yang harus anda Zakat kan : " + jumlah_zakat);
                            System.out.println("=====================================================================================================");
                        }
                        else{
                            System.out.println("=====================================================================================================");
                            System.out.println("Anda tidak Wajib Membayar Zakat");
                            System.out.println("=====================================================================================================");
                        }
            }
            
            public static void Ulangi(){
                System.out.println();
                System.out.print("Apakah anda ingin Menghitung lagi? (Y/N) : ");
                ulangi = sc.next().charAt(0);
                if (ulangi == 'Y'){
                    TampilkanMenu();
                }
            }
            public static void main(String[] args) {
                TampilkanMenu();
                System.out.println();
                System.out.println("Terimakasih telah menggunakan layanan kami :D");
            }
}