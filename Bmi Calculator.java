package variables;

public class Calculations {

    public static void main(String[] args) {

double height = 180.0;
double heightM = (height/100.0);
double weightKg = 105;
double bmi = (weightKg / (heightM * heightM));
double bmiTargetqq = bmi - 23;
        System.out.println("Wzrost w centymetrach: " + 180);
        System.out.println("Waga w kilogramach: " + 105);
        System.out.println("Docelowe BMI: " + 23);

        System.out.println();
        System.out.println("Rozpoczynamy obliczenia...");
        System.out.println();

    
        System.out.println("Wzrost wyrażony w metrach: " + heightM );

    
        System.out.println("Wzrost wyrażony w metrach i podniesiony do kwadratu: " + heightM * heightM);

        
        System.out.println("Obecne BMI: " + weightKg / (heightM * heightM));

     
        System.out.println("Różnica między BMI obecnym, a BMI docelowym: " + (bmi - 23));

      
        System.out.println("Docelowa zmiana wagi: " + (bmiTargetqq / heightM)*(bmiTargetqq / heightM));
    }
}