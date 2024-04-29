public class OperatorBinary{
    public static void main(String[] args){
        //operand
        //assignment
        String nama = "Mirza";
        int jumlahSks = 144;
        double ipk = 3.89;


        //aritmatika
        // System.out.println(1+2);
        // System.out.println(1-2);
        // System.out.println(1*2);
        // System.out.println(1/2);
        // System.out.println(1%2);

        //operator unary
        // System.out.println(jumlahSks);
        // System.out.println(jumlahSks++);
        // System.out.println(jumlahSks);
        // System.out.println(++jumlahSks);
        // System.out.println(jumlahSks);

        //operator ternary
        System.out.println(ipk>3.5 ? "Dengan Pujian" : "B aja");
        // System.out.println(uangDidompet>totalBelanja ? "Uang kurang" : "Uang cukup");


        double uang = 50000;
        double belanja = 53000;
        double angsul = 0;
        if(belanja > uang){
            System.out.println("Kurang");
        } else if(uang > belanja){
            angsul = uang-belanja;
            System.out.println("Lebih");
        } else {
            System.out.println("Pas");
        }
        System.out.println(angsul);
    }
}