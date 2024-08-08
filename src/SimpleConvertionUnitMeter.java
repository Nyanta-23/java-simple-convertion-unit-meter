import java.util.Scanner;
public class SimpleConvertionUnitMeter {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        String getValueTargetUnit, getValueSourceUnit;
        int chooseConvertingTo, chooseMeterUnit;
        double meter;

        System.out.println(
                "Masukkan satuan unit meter\n1.km\n2.hm\n3.dam\n4.m\n5.dm\n6.cm\n7.mm"
        );

        chooseMeterUnit = inputUser.nextInt();
        getValueSourceUnit = statementUsers(chooseMeterUnit);

        System.out.println("Masukkan jumlah unit meter");
        meter = inputUser.nextDouble();

        System.out.println(
                "Masukkan tujuan untuk dikonversikan kemana?\n1.km\n2.hm\n3.dam\n4.m\n5.dm\n6.cm\n7.mm"
        );
        chooseConvertingTo = inputUser.nextInt();
        getValueTargetUnit = statementUsers(chooseConvertingTo);

        double result = convertDistance(meter, getValueSourceUnit, getValueTargetUnit);

        System.out.println(meter + " " + getValueSourceUnit + " => " + result + " " + getValueTargetUnit);
    }

    static double convertDistance(double distance, String sourceUnit, String targetUnit) {
        double meter = convertToMeters(distance, sourceUnit);
        return convertFromMeters(meter, targetUnit);
    }

    static double convertToMeters(double distance, String unit) {
        switch (unit) {
            case "km":
                return distance * 1000;
            case "hm":
                return distance * 100;
            case "dam":
                return distance * 10;
            case "m":
                return distance;
            case "dm":
                return distance / 10;
            case "cm":
                return distance / 100;
            case "mm":
                return distance / 1000;
            default:
                System.out.println("Satuan asal tidak valid");
                System.exit(0);
                return 0;
        }
    }

    static double convertFromMeters(double meter, String targetUnit) {
        switch (targetUnit) {
            case "km":
                return meter / 1000;
            case "hm":
                return meter / 100;
            case "dam":
                return meter / 10;
            case "m":
                return meter;
            case "dm":
                return meter * 10;
            case "cm":
                return meter * 100;
            case "mm":
                return meter * 1000;
            default:
                System.out.println("Satuan tujuan tidak valid");
                System.exit(0);
                return 0;
        }
    }

    static String statementUsers(int statementUsers) {
        String statementMetersUnit = "";

        switch (statementUsers) {
            case 1:
                statementMetersUnit = "km";
                break;
            case 2:
                statementMetersUnit = "hm";
                break;
            case 3:
                statementMetersUnit = "dam";
                break;
            case 4:
                statementMetersUnit = "m";
                break;
            case 5:
                statementMetersUnit = "dm";
                break;
            case 6:
                statementMetersUnit = "cm";
                break;
            case 7:
                statementMetersUnit = "mm";
                break;
            default:
                System.out.println("Pilihan tidak valid");
                System.exit(0);
        }

        return statementMetersUnit;
    }
}