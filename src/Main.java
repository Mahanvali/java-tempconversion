package tempconversion.src;

import java.util.Scanner;

public class Main {
    static void CelsiusToFahrenheit(Scanner inputObj){
        System.out.print("Celsius: ");
        double celsiusInput = inputObj.nextDouble();
        double outputFormula = (celsiusInput * 9/5) + 32;
        System.out.println("///////////////////////////////////////////////////");
        System.out.println(celsiusInput +  "°C" + " -> " + outputFormula + "°F");
        System.out.println("///////////////////////////////////////////////////");
    }

    static void FahrenheitToCelsius(Scanner inputObj){
        System.out.print("Fahrenheit: ");
        double fahrenheitInput = inputObj.nextDouble();
        double outputFormula = (fahrenheitInput - 32) * 5/9;
        System.out.println("///////////////////////////////////////////////////");
        System.out.println(fahrenheitInput +  "°F" + " -> " + outputFormula + "°C");
        System.out.println("///////////////////////////////////////////////////");
    }

    static void FahrenheitToKelvin(Scanner inputObj){
        System.out.print("Fahrenheit: ");
        double fahrenheitInput = inputObj.nextDouble();
        double outputFormula = (fahrenheitInput - 32) * 5 / 9 + 273.15;
        System.out.println("///////////////////////////////////////////////////");
        System.out.println(fahrenheitInput +  "°F" + " -> " + outputFormula + "K");
        System.out.println("///////////////////////////////////////////////////");
    }

    static void CelsiusToKelvin(Scanner inputObj){
        System.out.print("Celsius: ");
        double celsiusInput = inputObj.nextDouble();
        double outputFormula = celsiusInput + 273.15;
        System.out.println("///////////////////////////////////////////////////");
        System.out.println(celsiusInput +  "°C" + " -> " + outputFormula + "K");
        System.out.println("///////////////////////////////////////////////////");
    }

    static void KelvinToFahrenheit(Scanner inputObj){
        System.out.print("Kelvin: ");
        double kelvinInput = inputObj.nextDouble();
        double outputFormula = (kelvinInput - 273.15) * 9/5 + 32;
        System.out.println("///////////////////////////////////////////////////");
        System.out.println(kelvinInput +  "K" + " -> " + outputFormula + "°F");
        System.out.println("///////////////////////////////////////////////////");
    }

    static void KelvinToCelsius(Scanner inputObj){
        System.out.print("Kelvin: ");
        double kelvinInput = inputObj.nextDouble();
        double outputFormula = kelvinInput - 273.15;
        System.out.println("///////////////////////////////////////////////////");
        System.out.println(kelvinInput +  "K" + " -> " + outputFormula + "°C");
        System.out.println("///////////////////////////////////////////////////");
    }

    public static void main(String args[]){
        Scanner scannerObj = new Scanner(System.in);    //  Create scanner object to get input
        while (true) {
            System.out.println("CtoF = Celsius to Fahrenheit");
            System.out.println("CtoK = Celsius to Kelvin");
            System.out.println("FtoC = Fahrenheit to Celsius");
            System.out.println("FtoK = Fahrenheit to Kelvin");
            System.out.println("KtoF = Kelvin to Fahrenheit");
            System.out.println("KtoC = Kelvin to Celsius");
            System.out.print("Conversion (CtoF, CtoK, FtoC, FtoK, KtoF, KtoC or exit): ");
            String conversionString = scannerObj.nextLine();    //  Input for selecting the different conversions
            switch (conversionString.toLowerCase()) {
                case "ctof":
                    CelsiusToFahrenheit(scannerObj);
                    scannerObj.nextLine();  //  Catch the whitespace so that conversionString doesnt show twice
                break;
    
                case "ftoc":
                    FahrenheitToCelsius(scannerObj); 
                    scannerObj.nextLine();  //  Catch the whitespace so that conversionString doesnt show twice
                break;

                case "ftok":
                    FahrenheitToKelvin(scannerObj);
                    scannerObj.nextLine();  //  Catch the whitespace so that conversionString doesnt show twice
                break;

                case "ctok":
                    CelsiusToKelvin(scannerObj);
                    scannerObj.nextLine();  //  Catch the whitespace so that conversionString doesnt show twice
                break;
                
                case "ktof":
                    KelvinToFahrenheit(scannerObj);
                    scannerObj.nextLine();  //  Catch the whitespace so that conversionString doesnt show twice
                break;

                case "ktoc":
                    KelvinToCelsius(scannerObj);
                    scannerObj.nextLine();  //  Catch the whitespace so that conversionString doesnt show twice
                break;

                case "exit":
                    scannerObj.close();
                return;
            }
        }
    }
}
