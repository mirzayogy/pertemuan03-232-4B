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
    }
}