public class OperasiString{
    public static void main(String[] args){
        int i = 0;
        double ipk = 4.0;
        String kota = "Banjarbaru";

        char[] uniskaChar = {'U','N','I','S','K','A'};

        String uniskaString = new String(uniskaChar);

        System.out.println(kota);
        System.out.println(uniskaChar);
        System.out.println(uniskaString);

        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(uniskaString.substring(5));
        System.out.println(kota.substring(0,4));
        System.out.println(uniskaString.substring(0,4));

        String hariIni = "2024-04-22";
        String tahun = hariIni.substring(0,4);
        String bulan = hariIni.substring(5,7);
        String tanggal = hariIni.substring(8,10);

        System.out.println(tanggal + "-" + bulan +"-" +tahun);

        System.out.println(hariIni.length());
        System.out.println(hariIni.charAt(3));
        System.out.println(hariIni.replace("-","/"));

        String bulanTeks = "";
        if(bulan.equals("01")){
            bulanTeks = "Januari";
        } else if(bulan.equals("02")) {
            bulanTeks = "Februari";
        } else if(bulan.equals("03")) {
            bulanTeks = "Maret";
        } else if(bulan.equals("04")) {
            bulanTeks = "April";
        } else if(bulan.equals("05")) {
            bulanTeks = "Mei";
        }else if(bulan.equals("06")) {
            bulanTeks = "Juni";
        }else if(bulan.equals("07")) {
            bulanTeks = "Juli";
        }else if(bulan.equals("08")) {
            bulanTeks = "Agustus";
        }else if(bulan.equals("09")) {
            bulanTeks = "September";
        }else if(bulan.equals("10")) {
            bulanTeks = "Oktober";
        }else if(bulan.equals("11")) {
            bulanTeks = "November";
        }else if(bulan.equals("12")) {
            bulanTeks = "Desember";
        }else {
            bulanTeks = "Tidak valid";
        }

        System.out.println(tanggal + " " + bulanTeks +" " +tahun);

        
    }
}