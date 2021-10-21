package com.project;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        boolean isIncorrect;
        boolean isTrue;
        System.out.println("Добро пожаловать в программу конвертации величин");
        do{
            System.out.println("\n***********************************************************************************\nИспользуйте следующие коды для выбора величины для конвертации: \n 1 - Валюта \n 2 - Длина \n 3 - Время \n 4 - Площадь \n 5 - Объём \n 6 - Скорость \n 7 - Температура \n 8 - Масса \n 9 - Завершить программу \n" );

            isTrue = true;
            Scanner in = new Scanner(System.in);
            int choice = 0;
            do {
                isIncorrect = false;
                System.out.print("Выберите величину для конвертации:");
                try {
                    choice = Integer.parseInt(in.nextLine());
                } catch (Exception e) {
                    System.out.println("Вы ввели неподходящий код величины");
                    isIncorrect = true;
                }
                if (!isIncorrect && (choice < 1) || (choice > 9)) {
                    System.out.println("Вы ввели неподходящий код величины");
                    choice = 0;
                    isIncorrect = true;
                }
            } while (isIncorrect);
            if (choice == 1) {
                Currency();
            } else if (choice == 2) {
                Length();
            } else if (choice == 3) {
                Time();
            } else if (choice == 4) {
                Square();
            } else if (choice == 5) {
                Value();
            } else if (choice == 6) {
                Speed();
            } else if (choice == 7) {
                Temperature();
            } else if (choice == 8) {
                Weight();
            } else{
                isTrue = false;
            }
        } while (isTrue);
    }
    public static void Currency() {
        char us_dollar_sym = 36;
        char pound_sym = 163;
        char euro_sym = 8364;
        char yen_sym = 165;
        char bel_rub_sym = 8381;
        char rus_rub_sym = 8381;
        char zloty_sym = 90;

        String us_dollar = "Американский доллар";
        String pound = "Английский фунт";
        String yen = "Японская йена";
        String euro = "Евро";
        String bel_rub = "Белорусский рубль";
        String rus_rub = "Российский рубль";
        String zloty = "Польский злотый";
        double rate;
        boolean isIncorrect;
        // Интерфейс

        System.out.println("Используйте следующие коды для ввода выбранной валюты: \n 1 - Американский доллар \n 2 - Евро \n 3 - Английский фунт \n 4 - Японская йена \n 5 - Белорусский рубль \n 6 - Российский рубль \n 7 - Польский злотый \n 8 - Завершить конвертацию валют \n");

        //Ввод первой валюты и проверка

        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            isIncorrect = false;
            System.out.print("Выберите валюту ввода:");
            try {
                choice = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели неподходящий код валюты");
                isIncorrect = true;
            }
            if (!isIncorrect && (choice < 1) || (choice > 8)) {
                System.out.println("Вы ввели неподходящий код валюты");
                choice = 0;
                isIncorrect = true;
            }
        } while (isIncorrect);
        String inType;
        switch (choice) {
            case 1 -> inType = "Американский доллар >> " + us_dollar_sym;
            case 2 -> inType = "Евро >> " + euro_sym;
            case 3 -> inType = "Английский фунт >> " + pound_sym;
            case 4 -> inType = "Японская йена >> " + yen_sym;
            case 5 -> inType = "Белорусский рубль >> " + bel_rub_sym;
            case 6 -> inType = "Российский рубль >> " + rus_rub_sym;
            case 7 -> inType = "Польский злотый >> " + zloty_sym;
            default -> {
                return;
            }
        }
        //Ввод второй валюты и проверка
        int output = 0;
        do {
            isIncorrect = false;
            System.out.print("Выберите валюту вывода:");
            try {
                output = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели неподходящий код валюты");
                isIncorrect = true;
            }
            if (!isIncorrect && (output < 1) || (output > 7)) {
                System.out.println("Вы ввели неподходящий код валюты");
                output = 0;
                isIncorrect = true;
            }
            if (!isIncorrect && choice == output) {
                System.out.println("Та же валюта не может быть конвертирована");
                isIncorrect = true;
            }
        } while (isIncorrect);

        //Ввод сумма перевода и проверка
        double input = 0;
        do {
            isIncorrect = false;
            System.out.print("Введите сумму для конвертации из " + inType);
            try {
                input = Double.parseDouble(in.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели неподходящую сумму");
                isIncorrect = true;
            }
            if (!isIncorrect && (input <= 0)) {
                System.out.println("Вы ввели неподходящую сумму");
                input = 0;
                isIncorrect = true;
            }
        } while (isIncorrect);

        //Доллар во все валюты
        if (choice == 1 && output == 2) {
            double dollar_euro_rate = 0.852988;
            rate = input * dollar_euro_rate;
            System.out.printf("%s" + input + " по курсу " + dollar_euro_rate + " Американский доллар в %s = %.2f\n", us_dollar_sym, euro, rate);
        } else if (choice == 1 && output == 3) {
            double dollar_pound_rate = 0.732562;
            rate = input * dollar_pound_rate;
            System.out.printf("%s" + input + " по курсу " + dollar_pound_rate + " Американский доллар в %s = %.2f\n", us_dollar_sym, pound, rate);
        } else if (choice == 1 && output == 4) {
            double dollar_yen_rate = 109.633;
            rate = input * dollar_yen_rate;
            System.out.printf("%s" + input + " по курсу " + dollar_yen_rate + " Американский доллар в %s = %.2f\n", us_dollar_sym, yen, rate);
        } else if (choice == 1 && output == 5) {
            double dollar_bel_rub_rate = 2.50223;
            rate = input * dollar_bel_rub_rate;
            System.out.printf("%s" + input + " по курсу " + dollar_bel_rub_rate + " Американский доллар в %s = %.2f\n", us_dollar_sym, bel_rub, rate);
        } else if (choice == 1 && output == 6) {
            double dollar_rus_rub_rate = 72.8849;
            rate = input * dollar_rus_rub_rate;
            System.out.printf("%s" + input + " по курсу " + dollar_rus_rub_rate + " Американский доллар в %s = %.2f\n", us_dollar_sym, rus_rub, rate);
        } else if (choice == 1) {
            double dollar_zloty_rate = 3.94333;
            rate = input * dollar_zloty_rate;
            System.out.printf("%s" + input + " по курсу " + dollar_zloty_rate + " Американский доллар в %s = %.2f\n", us_dollar_sym, zloty, rate);
        }

        //Евро во все валюты

        if (choice == 2 && output == 1) {
            double euro_dollar_rate = 1.1728;
            rate = input * euro_dollar_rate;
            System.out.printf("%s" + input + " по курсу " + euro_dollar_rate + " Евро в %s = %.2f\n", euro_sym, us_dollar, rate);
        } else if (choice == 2 && output == 3) {
            double euro_pound_rate = 0.792648;
            rate = input * euro_pound_rate;
            System.out.printf("%s" + input + " по курсу " + euro_pound_rate + " Евро в %s = %.2f\n", euro_sym, pound, rate);
        } else if (choice == 2 && output == 4) {
            double euro_yen_rate = 136.708;
            rate = input * euro_yen_rate;
            System.out.printf("%s" + input + " по курсу " + euro_yen_rate + " Евро в %s = %.2f\n", euro_sym, yen, rate);
        } else if (choice == 2 && output == 5) {
            double euro_bel_rub_rate = 2.9394;
            rate = input * euro_bel_rub_rate;
            System.out.printf("%s" + input + " по курсу " + euro_bel_rub_rate + " Евро в %s = %.2f\n", euro_sym, bel_rub, rate);
        } else if (choice == 2 && output == 6) {
            double euro_rus_rub_rate = 84.875;
            rate = input * euro_rus_rub_rate;
            System.out.printf("%s" + input + " по курсу " + euro_rus_rub_rate + " Евро в %s = %.2f\n", euro_sym, rus_rub, rate);
        } else if (choice == 2) {
            double euro_zloty_rate = 4.63;
            rate = input * euro_zloty_rate;
            System.out.printf("%s" + input + " по курсу " + euro_zloty_rate + " Евро в %s = %.2f\n", euro_sym, zloty, rate);
        }

        //Английский фунт во все валюты

        if (choice == 3 && output == 1) {
            double pound_dollar_rate = 1.60972;
            rate = input * pound_dollar_rate;
            System.out.printf("%s" + input + " по курсу " + pound_dollar_rate + " Английский фунт в %s = %.2f\n", pound_sym, us_dollar, rate);
        } else if (choice == 3 && output == 2) {
            double pound_euro_rate = 1.26161;
            rate = input * pound_euro_rate;
            System.out.printf("%s" + input + " по курсу " + pound_euro_rate + " Английский фунт в %s = %.2f\n", pound_sym, euro, rate);
        } else if (choice == 3 && output == 4) {
            double pound_yen_rate = 172.511;
            rate = input * pound_yen_rate;
            System.out.printf("%s" + input + " по курсу " + pound_yen_rate + " Английский фунт в %s = %.2f\n", pound_sym, yen, rate);
        } else if (choice == 3 && output == 5) {
            double pound_bel_rub_rate = 3.4181;
            rate = input * pound_bel_rub_rate;
            System.out.printf("%s" + input + " по курсу " + pound_bel_rub_rate + " Английский фунт в %s = %.2f\n", pound_sym, bel_rub, rate);
        } else if (choice == 3 && output == 6) {
            double pound_rus_rub_rate = 99.0681;
            rate = input * pound_rus_rub_rate;
            System.out.printf("%s" + input + " по курсу " + pound_rus_rub_rate + " Английский фунт в %s = %.2f\n", pound_sym, rus_rub, rate);
        } else if (choice == 3) {
            double pound_zloty_rate = 5.4007;
            rate = input * pound_zloty_rate;
            System.out.printf("%s" + input + " по курсу " + pound_zloty_rate + " Английский фунт в %s = %.2f\n", pound_sym, zloty, rate);
        }

        //Йена во все валюты

        if (choice == 4 && output == 1) {
            double yen_dollar_rate = 0.00932574;
            rate = input * yen_dollar_rate;
            System.out.printf("%s" + input + " по курсу " + yen_dollar_rate + " Японская йена %s = %.2f\n", yen_sym, us_dollar, rate);
        } else if (choice == 4 && output == 2) {
            double yen_euro_rate = 0.00730615;
            rate = input * yen_euro_rate;
            System.out.printf("%s" + input + " по курсу " + yen_euro_rate + " Японская йена %s = %.2f\n", yen_sym, euro, rate);
        } else if (choice == 4 && output == 3) {
            double yen_pound_rate = 0.00579135;
            rate = input * yen_pound_rate;
            System.out.printf("%s" + input + " по курсу " + yen_pound_rate + " Японская йена %s = %.2f\n", yen_sym, pound, rate);
        } else if (choice == 4 && output == 5) {
            double yen_bel_rub_rate = 0.022;
            rate = input * yen_bel_rub_rate;
            System.out.printf("%s" + input + " по курсу " + yen_bel_rub_rate + " Японская йена в %s = %.2f\n", yen_sym, bel_rub, rate);
        } else if (choice == 3 && output == 6) {
            double yen_rus_rub_rate = 65.16;
            rate = input * yen_rus_rub_rate;
            System.out.printf("%s" + input + " по курсу " + yen_rus_rub_rate + " Японская йена в %s = %.2f\n", yen_sym, rus_rub, rate);
        } else if (choice == 3) {
            double yen_zloty_rate = 0.036;
            rate = input * yen_zloty_rate;
            System.out.printf("%s" + input + " по курсу " + yen_zloty_rate + " Японская йена в %s = %.2f\n", yen_sym, zloty, rate);
        }

        //Бел руб во все валюты

        if (choice == 5 && output == 1) {
            double bel_rub_dollar_rate = 0.3987;
            rate = input * bel_rub_dollar_rate;
            System.out.printf("%s" + input + " по курсу " + bel_rub_dollar_rate + " Белорусский рубль в %s = %.2f\n", bel_rub_sym, us_dollar, rate);
        } else if (choice == 5 && output == 2) {
            double bel_rub_euro_rate = 0.342;
            rate = input * bel_rub_euro_rate;
            System.out.printf("%s" + input + " по курсу " + bel_rub_euro_rate + " Белорусский рубль в %s = %.2f\n", bel_rub_sym, euro, rate);
        } else if (choice == 5 && output == 3) {
            double bel_rub_pound_rate = 0.29;
            rate = input * bel_rub_pound_rate;
            System.out.printf("%s" + input + " по курсу " + bel_rub_pound_rate + " Белорусский рубль в %s = %.2f\n", bel_rub_sym, pound, rate);
        } else if (choice == 5 && output == 4) {
            double bel_rub_yen_rate = 44.74;
            rate = input * bel_rub_yen_rate;
            System.out.printf("%s" + input + " по курсу " + bel_rub_yen_rate + " Белорусский рубль в %s = %.2f\n", bel_rub_sym, yen, rate);
        } else if (choice == 5 && output == 6) {
            double bel_rub_rus_rub_rate = 29.025;
            rate = input * bel_rub_rus_rub_rate;
            System.out.printf("%s" + input + " по курсу " + bel_rub_rus_rub_rate + " Белорусский рубль в %s = %.2f\n", bel_rub_sym, rus_rub, rate);
        } else if (choice == 5) {
            double bel_rub_zloty_rate = 1.58;
            rate = input * bel_rub_zloty_rate;
            System.out.printf("%s" + input + " по курсу " + bel_rub_zloty_rate + " Белорусский рубль в %s = %.2f\n", bel_rub_sym, zloty, rate);
        }

        // Рос руб во все валюты

        if (choice == 6 && output == 1) {
            double rus_rub_dollar_rate = 0.0137;
            rate = input * rus_rub_dollar_rate;
            System.out.printf("%s" + input + " по курсу " + rus_rub_dollar_rate + " Российский рубль в %s = %.2f\n", rus_rub_sym, us_dollar, rate);
        } else if (choice == 6 && output == 2) {
            double rus_rub_euro_rate = 0.012;
            rate = input * rus_rub_euro_rate;
            System.out.printf("%s" + input + " по курсу " + rus_rub_euro_rate + " Российский рубль в %s = %.2f\n", rus_rub_sym, euro, rate);
        } else if (choice == 6 && output == 3) {
            double rus_rub_pound_rate = 0.0102;
            rate = input * rus_rub_pound_rate;
            System.out.printf("%s" + input + " по курсу " + rus_rub_pound_rate + " Российский рубль в %s = %.2f\n", rus_rub_sym, pound, rate);
        } else if (choice == 6 && output == 4) {
            double rus_rub_yen_rate = 1.5347;
            rate = input * rus_rub_yen_rate;
            System.out.printf("%s" + input + " по курсу " + rus_rub_yen_rate + " Российский рубль в %s = %.2f\n", rus_rub_sym, yen, rate);
        } else if (choice == 6 && output == 5) {
            double rus_rub_bel_rub_rate = 0.034;
            rate = input * rus_rub_bel_rub_rate;
            System.out.printf("%s" + input + " по курсу " + rus_rub_bel_rub_rate + " Российский рубль в %s = %.2f\n", rus_rub_sym, bel_rub, rate);
        } else if (choice == 6) {
            double rus_rub_zloty_rate = 0.055;
            rate = input * rus_rub_zloty_rate;
            System.out.printf("%s" + input + " по курсу " + rus_rub_zloty_rate + " Российский рубль в %s = %.2f\n", rus_rub_sym, zloty, rate);
        }

        // Злотый во все валюты

        if (choice == 7 && output == 1) {
            double zloty_dollar_rate = 0.253;
            rate = input * zloty_dollar_rate;
            System.out.printf("%s" + input + " по курсу " + zloty_dollar_rate + " Польский злотый в %s = %.2f\n", zloty_sym, us_dollar, rate);
        } else if (choice == 7 && output == 2) {
            double zloty_euro_rate = 0.2166;
            rate = input * zloty_euro_rate;
            System.out.printf("%s" + input + " по курсу " + zloty_euro_rate + " Польский злотый в %s = %.2f\n", zloty_sym, euro, rate);
        } else if (choice == 7 && output == 3) {
            double zloty_pound_rate = 0.1852;
            rate = input * zloty_pound_rate;
            System.out.printf("%s" + input + " по курсу " + zloty_pound_rate + " Польский злотый в %s = %.2f\n", zloty_sym, pound, rate);
        } else if (choice == 7 && output == 4) {
            double zloty_yen_rate = 28.04;
            rate = input * zloty_yen_rate;
            System.out.printf("%s" + input + " по курсу " + zloty_yen_rate + " Польский злотый в %s = %.2f\n", zloty_sym, yen, rate);
        } else if (choice == 7 && output == 5) {
            double zloty_bel_rub_rate = 0.6329;
            rate = input * zloty_bel_rub_rate;
            System.out.printf("%s" + input + " по курсу " + zloty_bel_rub_rate + " Польский злотый в %s = %.2f\n", zloty_sym, bel_rub, rate);
        } else if (choice == 7) {
            double zloty_rus_rub_rate = 18.3435;
            rate = input * zloty_rus_rub_rate;
            System.out.printf("%s" + input + " по курсу " + zloty_rus_rub_rate + " Польский злотый в %s = %.2f\n", zloty_sym, rus_rub, rate);
        }

    }
    public static void Length() {
        double result;
        boolean isIncorrect;

        // Интерфейс
        System.out.println("Вы выбрали перевод единиц длины");
        System.out.println("Используйте следующие коды для ввода выбранной единицы длины:\n 1 - Километры \n 2 - Метры \n 3 - Дециметры \n 4 - Сантиметры \n 5 - Миллиметры");

        //Ввод первой величины и проверка

        Scanner in = new Scanner(System.in);
        int choice = 0;
        do {
            isIncorrect = false;
            System.out.print("Выберите величину ввода:");
            try {
                choice = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели неподходящий код величины");
                isIncorrect = true;
            }
            if (!isIncorrect && (choice < 0) || (choice > 5)) {
                System.out.println("Вы ввели неподходящий код величины");
                choice = 0;
                isIncorrect = true;
            }
        } while (isIncorrect);
        String inType;
        switch (choice) {
            case 1 -> inType = "Километры >> ";
            case 2 -> inType = "Метры >> ";
            case 3 -> inType = "Дециметры >> ";
            case 4 -> inType = "Сантиметры >> ";
            case 5 -> inType = "Миллиметры >> ";
            default -> {
                return;
            }
        }
        //Ввод второй величины и проверка
        int output = 0;
        do {
            isIncorrect = false;
            System.out.print("Выберите величиу вывода:");
            try {
                output = Integer.parseInt(in.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели неподходящий код величины");
                isIncorrect = true;
            }
            if (!isIncorrect && (output < 1) || (output > 5)) {
                System.out.println("Вы ввели неподходящий код величины");
                output = 0;
                isIncorrect = true;
            }
            if (!isIncorrect && choice == output) {
                System.out.println("Та же величина не может быть конвертирована");
                isIncorrect = true;
            }
        } while (isIncorrect);

        //Ввод суммы перевода
        double input = 0;
        do {
            isIncorrect = false;
            System.out.print("Введите число для конвертации из " + inType);
            try {
                input = Double.parseDouble(in.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели неподходящее число");
                isIncorrect = true;
            }
            if (!isIncorrect && (input <= 0)) {
                System.out.println("Вы ввели неподходяще число");
                input = 0;
                isIncorrect = true;
            }
        } while (isIncorrect);

        if (choice == 1 && output == 2) {
            double km_m_rate = 1000;
            result = input * km_m_rate;
            System.out.printf("Километр в метр: %f км = %.0f м\n", input, result);
        } else if (choice == 1 && output == 3) {
            double km_dcm_rate = 10000;
            result = input * km_dcm_rate;
            System.out.printf("Километр в дециметр: %f км = %.0f дм\n", input, result);
        } else if (choice == 1 && output == 4) {
            double km_cm_rate = 100000;
            result = input * km_cm_rate;
            System.out.printf("Километр в сантиметр: %f км = %.0f см\n", input, result);
        } else if (choice == 1) {
            double km_mm_rate = 1000000;
            result = input * km_mm_rate;
            System.out.printf("Километр в миллиметр: %f км = %.0f мм\n", input, result);
        }
    }


    public static void Time() {

    }
    public static void Square() {

    }
    public static void Value() {}
    public static void Speed() {}
    public static void Temperature() {}
    public static void Weight() {}
}