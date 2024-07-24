package tempconversion.src;

import java.util.Scanner;

//  TODO: ADD KELVIN

public class Main {
    static void CelsiusToFahrenheit(Scanner inputObj){
        System.out.print("Celsius: ");
        double celsiusInput = inputObj.nextDouble();
        double outputFormula = (celsiusInput * 9/5) + 32;
        System.out.println(celsiusInput +  "°C" + " -> " + outputFormula + "°F");
    }
    static void FahrenheitToCelsius(Scanner inputObj){
        System.out.print("Fahrenheit: ");
        double farenheitInput = inputObj.nextDouble();
        double outputFormula = (farenheitInput - 32) * 5/9;
        System.out.println(farenheitInput +  "°F" + " -> " + outputFormula + "°C");
    }

    static void FahrenheitToKelvin(Scanner inputObj){
        System.out.print("Fahrenheit: ");
        double farenheitInput = inputObj.nextDouble();
        double outputFormula = (farenheitInput - 32) * 5 / 9 + 273.15;
        System.out.println(farenheitInput +  "°F" + " -> " + outputFormula + "K");
    }

    static void CelsiusToKelvin(Scanner inputObj){
        System.out.print("Celsius: ");
        double celsiuInput = inputObj.nextDouble();
        double outputFormula = celsiuInput + 273.15;
        System.out.println(celsiuInput +  "°C" + " -> " + outputFormula + "K");
    }

    static void KelvinToFahrenheit(Scanner inputObScanner){

    }

    static void KelvinToCelsius(Scanner inputObScanner){

    }
    public static void main(String args[]){
        Scanner scannerObj = new Scanner(System.in);    //  Create scanner object to get input
        while (true) {
            System.out.print("Conversion (CtoF, FtoC, FtoK, CtoK or exit): ");
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

                case "ctok":
                    CelsiusToKelvin(scannerObj);
                    scannerObj.nextLine();  //  Catch the whitespace so that conversionString doesnt show twice

                case "exit":
                    scannerObj.close();
                return;
            }
        }
    }
}
