package variables;

public class Calculations {

    public static void main(String[] args) {

double height = Prompt.promptDouble("Podaj wzrost w Centymetrach: ");
double heightM = (height/100.0);
double weightKg = Prompt.promptDouble("Podaj wage w Kilogramach: ");
double heightmkw = heightM * heightM;
double bmi = weightKg / heightmkw;

double bmiTargetqq = Prompt.promptDouble("Podaj docelowe BMI: ");
double BmiDiff = bmi - bmiTargetqq;
        System.out.println("Wzrost w centymetrach: " + height);
        System.out.println("Waga w kilogramach: " + weightKg);
        System.out.println("Docelowe BMI: " + bmiTargetqq);

        System.out.println();
        System.out.println("Rozpoczynamy obliczenia...");
        System.out.println();


        System.out.println("Wzrost wyrażony w metrach: " + heightM );


        System.out.println("Wzrost wyrażony w metrach i podniesiony do kwadratu: " + heightmkw);


        System.out.println("Obecne BMI: " + bmi );


        System.out.println("Różnica między BMI obecnym, a BMI docelowym: " + (bmi - bmiTargetqq));


        System.out.println("Docelowa zmiana wagi: " + (BmiDiff * heightmkw) );
    }
}