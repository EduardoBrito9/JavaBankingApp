//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.Random;


void main() {
/*    System.out.println("\"\tlfg\n\n\n\"");
    System.out.println("Learning learning learning");

    // Variables
    // Primitive = simple value stored directly in memory (stack)
    // Reference = memory address (stack) that points to the (heap)
    // Primitive is the value, just the value. If you store it in another variable, the two will be independent.
    // |  Reference is the address, its one thing. It changes if you store in another variable.

    int age = 19;
    int year = 2026;
    double cost = 1.2;
    System.out.println("The year is " + year + ", and Im confident that I can achieve my goals " + cost);

    // char

    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    System.out.println("My grade is " + grade + " and Im satisfied cause now Im nearer of my " + currency + " goals" + symbol);

    boolean isStudent = true;
    boolean forSale = false;
    boolean isOnline = true;

    System.out.println(isOnline);

    String car = "Mustang";

    if(forSale){
        System.out.println("There is a " + car + "for sale!");
    }

    String name = "Dudu";
    String food = "Pizza";

    System.out.println("Hello" + name);
    System.out.println("Your favorite food is " + food);

    System.out.println("Enter your name: ");
    String userName = scanner.nextLine();
    System.out.println(userName);

    System.out.println("Enter your age");
    int userAgeUp = scanner.nextInt();

    System.out.println("what  are you saying is true?");
    boolean isTrue = scanner.nextBoolean();

    if (isTrue) {
        System.out.println("you are enrolled as a student");
    } else {
        System.out.println("this is not true");
    }

    System.out.println(isTrue);

    System.out.println(isTrue);

    //COMMON ISSUES
    System.out.print("Enter your age ");
    int ageIssue = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter your favorite color");
    String color = scanner.nextLine();

    System.out.println("You are " + ageIssue + " years old");
    System.out.println("You like the color " + color);

    //Area of a rectangle

    double width = 0;
    double height = 0;
    double area = 0;

    System.out.println("Enter width: ");
    width = scanner.nextDouble();

    System.out.println("Enter height:");
    height = scanner.nextDouble();

    area = width * height;

    System.out.println("The area is " + area + "cm2 m");

    // Game

    String adjective;
    String adjective1;
    String typeOfBird;
    String rH;
    String verbPt;
    String verb;
    String relativeName;
    String noun;
    String liquid;
    String verbing;
    String pBody;
    String pluralNoun;
    String verbing2;
    String noun2;

    System.out.println("Enter an adjective");
    adjective = scanner.nextLine();
    scanner.nextLine();
    System.out.println("Enter another adjective");
    adjective1 = scanner.nextLine();
    System.out.println("say a type of bird");
    typeOfBird = scanner.nextLine();
    System.out.println("say some room in a house");
    rH = scanner.nextLine();
    System.out.println("say a verb (past tense)");
    verbPt = scanner.nextLine();
    System.out.println("say a verb");
    verb = scanner.nextLine();
    System.out.println("say a relative name");
    relativeName = scanner.nextLine();
    System.out.println("say a noun");
    noun = scanner.nextLine();
    System.out.println("say a liquid");
    liquid = scanner.nextLine();
    System.out.println("say a verb (ing)");
    verbing = scanner.nextLine();
    System.out.println("say a part of the body (plural)");
    pBody = scanner.nextLine();
    System.out.println("say a plural noun");
    pluralNoun = scanner.nextLine();
    System.out.println("say another verb (ing)");
    verbing2 = scanner.nextLine();
    System.out.println("say another noun");
    noun2 = scanner.nextLine();

    System.out.println("it was a " + adjective + " cold November day. I woke up to the " + adjective1 + " smell of "
            + typeOfBird + " roasting in the " + rH + " dwonstairs. I  " + verbPt +  " down the stairs to see if I could help " + verb
            + " the dinner. My mom said, \"See if "  + relativeName + " needs a fresh " + noun + ".\" " + "So I carried a tray of glasses full of " + liquid +
            " into the " + verbing + " room." + "When I go there, I couldn't believe my " + pBody + "! There were " + pluralNoun + " " + verbing2 + " on the "
            + noun2+ ".");


    int x = 10;
    int y = 2;
    int z;

    z = x + y; //12


    String item;
    int quantity;
    double price;
    double pizzaPrice = 12.99;
    double pokePrice = 10;
    double crepiocaPrice = 2;

    System.out.println("What item would you like to buy?");
    item = scanner.nextLine();
    System.out.println("How many would you like?");
    quantity = scanner.nextInt();

    if(item == "pizza"){
        price = pizzaPrice;
    } else if(item == "poke") {
        price = pokePrice;
    } else {
        price = crepiocaPrice;
    }


    System.out.println("You have bought " + quantity + " " + item + "/s");
    System.out.println("Your total is $" + price*quantity);*/

    //String method
    // if(name.isEmpty();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    /*int number1;
    int number2;
    int number3;

    number1 = random.nextInt(1, 100);
    number2 = random.nextInt(1, 100);
    number3 = random.nextInt(1, 100);

    // se for double retornará algo entre 0 e 1.

    System.out.println(number1 + " " + number2 + " " + number3);

    System.out.println(Math.PI);
    System.out.println(Math.E);

    double result;
    result = Math.pow(2, 3); // elevado a
    System.out.println(result); // 8

    result = Math.abs(-5); //
    System.out.println(result); // -5 turns on 5. Its absolute.

    result = Math.sqrt(9); // square root is autoexplained = 3.0
    System.out.println(result);

    result = Math.round(3.14); // 3. It basically rounds the parameter to the nearest integer.
    System.out.println(result);

    result = Math.ceil(3.14); // 4. It rounds up. No matter what.
    System.out.println(result);

    result = Math.floor(3.99); // It rounds down. 3.
    System.out.println(result);

    //HYPOTENUSE c = Math.sqrt(aˆ2+bˆ2);

    double c1;
    double c2;
    double h;

    System.out.println("Enter the c1");
    c1 = scanner.nextDouble();
    System.out.println("Enter the c2");
    c2 = scanner.nextDouble();

    h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

    System.out.println(h);


    double radius;

    System.out.println("Enter a radius");
    radius = scanner.nextDouble();

    double cimcurference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius, 2);
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

    System.out.printf("The cimcurference is %.1f\n", cimcurference);
    System.out.printf("The area is %.1f\n", area);
    System.out.printf("The volume is %.1f\n", volume);

    String nameS = "SpongeBob";
    int ageS = 10;

    //System.out.printf("%s is %.1f years old", nameS, ageS);
    System.out.printf("%s is %d years old\n", nameS, ageS);

    double some = 9000.99;
    System.out.printf("%+.2f\n", some); // -> + 9000.99
    System.out.printf("%,.2f\n", some); // -> comma group separator 9,000.99
    System.out.printf("%(.2f", some); // -> if its negative, it will be show enclosed in ()
    System.out.printf("% .2f", some); //if its negative, -  || if its positive " ".

    int id1 = 1;
    int id2 = 23;
    int id3 = 456;
    int id4 = 7890;

    System.out.printf("%04d\n", id1);
    System.out.printf("%04d\n", id2);
    System.out.printf("%04d\n", id3);
    System.out.printf("%04d\n", id4);

    // "%04d" aligns the numbers - 0001 0023 0456 7890
    // "%4" aligns with space
    // "%-4" aligns left

    double amount;
    double rate;
    int timesC;
    int years;

    System.out.println("Enter the principal amount:");
    amount = scanner.nextDouble();
    System.out.println("Enter the interest rate (in %):");
    rate = scanner.nextDouble() / 100;
    System.out.println("Enter the # of times coumponded per year:");
    timesC = scanner.nextInt();
    System.out.println("Enter the # of years:");
    years = scanner.nextInt();

    double calc = amount * Math.pow((1 + rate / timesC), timesC * years);

    System.out.println("The amount after " + years + " is $" + calc);

    boolean isStudent;
    boolean isSenior;

    double price = 9.99;

    System.out.println("Are you a Senior?");
    isSenior = scanner.nextBoolean();
    System.out.println("Are you a Student?");
    isStudent = scanner.nextBoolean();

    if (isSenior || isStudent) {
        if (isSenior && isStudent) {
            price *= 0.7;
        } else if (isSenior) {
            price *= 0.8;
        } else {
            price *= 0.9;
        }
    }

    System.out.printf("Congrats! You got a offer ticket of $%.2f\n", price);
    scanner.nextLine();
    //substring = A method used to extract a portion of a string
    //  .substring(start, end)

    String email;
    String username;
    String domain;

    System.out.println("Enter your email");
    email = scanner.nextLine();

    if (email.contains("@")) {
        username = email.substring(0, email.indexOf("@")); //username.
        domain = email.substring(email.indexOf("@") + 1); //@user´s domain.

        System.out.println(username);
        System.out.println(domain);
    } else {
        System.out.println("Try again");
    }

    //Weight Conversion Program
    int option;
    double lbsTokgs;
    double kgsTolbs;
    double convert;

    System.out.println("1: Convert lbs to kgs");
    System.out.println("2: Convert kgs to lbs");
    System.out.println("Choose an option:");
    option = scanner.nextInt();
    if (option == 1) {
        System.out.println("Enter the weight in lbs:");
        lbsTokgs = scanner.nextDouble();
        convert = lbsTokgs * 0.453592;
        System.out.printf("Your weight converted to kgs is %.2f", convert);
    } else if (option == 2) {
        System.out.println("Enter the weight in kgs:");
        kgsTolbs = scanner.nextDouble();
        convert = kgsTolbs / 0.453592;
        System.out.printf("Your weight converted to lbs is %.2f\n", convert);
    } else {
        System.out.println("Try again");
    }

    //Ternary operator is a question mark
    //variable = (condition) ? ifTrue : ifFalse;

    int score = 70;

    String passOrFail = (score >= 60) ? "PASS" : "FAIL";

    int hours = 13;

    String timeOfDay = (hours >= 12) ? "IT IS" : "IT IS NOT";

    System.out.println(timeOfDay);


    System.out.println(passOrFail);


    double temperature;
    String cOrf;
    double resultTemp;


    System.out.println("Enter the temperature: ");
    temperature = scanner.nextDouble();
    scanner.nextLine();

    System.out.println("Convert to Celsius or Fahrenheit? (C or F):");
    cOrf = scanner.nextLine().toUpperCase();

    resultTemp = (cOrf.equals("C")) ? (temperature - 32) * 9 / 5 : (temperature * 9 / 5) + 32;

    System.out.printf("%.1f %s\n", resultTemp, cOrf);

    //enhanced switch

    String day;
    System.out.println("What day you will be ready?");
    day = scanner.nextLine().toUpperCase();

    switch (day) {
        case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("It is week");
        case "SATURDAY", "SUNDAY" -> System.out.println("It is weekend");
        default -> System.out.println("Invalid day");
    }
    ;


    //calculator

    int symbol;
    double number100;
    double number200;
    double resultCalculator = 0;


    System.out.println("Enter the first number:");
    number100 = scanner.nextDouble();

    scanner.nextLine();

    System.out.println("1 - '+', 2 - '-', 3 - '/', 4 - '*', 5 - **");
    System.out.println("Which operation would you like to do? (just enter the number)");
    symbol = scanner.nextInt();

    System.out.println("Enter the second number:");
    number200 = scanner.nextDouble();

    if (symbol >= 1 && symbol <= 5 && !(number200 == 0 && symbol == 3)) {
        switch (symbol) {
            case 1 -> resultCalculator = number100 + number200;
            case 2 -> resultCalculator = number100 - number200;
            case 3 -> resultCalculator = number100 / number200;
            case 4 -> resultCalculator = number100 * number200;
            case 5 -> resultCalculator = Math.pow(number100, number200);
        }
        System.out.println("The result is " + resultCalculator);
    } else {
        System.out.println("Error. Operation invalid. \nTips: Check if the option is right | Check if your numbers are right; ");
    }

    scanner.nextLine();

    String whileLearnedName = "";

    while (whileLearnedName.isEmpty()) {
        System.out.println("What is your name?");
        whileLearnedName = scanner.nextLine();
    }

    Random randomGuessingGame = new Random();

    int rn = randomGuessingGame.nextInt(101);
    System.out.println(rn);
    int secretUserNumber = -1;


    while (secretUserNumber != rn) {

        System.out.println("What is the secret number?");
        secretUserNumber = scanner.nextInt();
        if (secretUserNumber > rn && ((secretUserNumber - rn) <= 15)) {
            System.out.println("Its less. Try again. (obs: you are near from the number)");
        } else if (secretUserNumber < rn && (Math.abs((secretUserNumber - rn)) <= 15)) {
            System.out.println("Its more. Try again. (obs: you are near from the number)");
        } else if (secretUserNumber == rn) {
            System.out.println("You got it");
        } else {
            System.out.println("You are so far, loser.");
        }
    }

    scanner.nextLine();


    char userSymbol;
    int lines;
    int columns;

    System.out.println("with which symbol would you like to draw a wall?");
    userSymbol = scanner.next().charAt(0);
    System.out.println("How many columns?");
    columns = scanner.nextInt();
    System.out.println("How many lines?");
    lines = scanner.nextInt();


    for (int i = 0; i < lines; i++) {
        for (int j = 0; j < columns; j++) {
            System.out.print(userSymbol);
        }
        System.out.println();
    }*/

    //Thread sleep for some situation that we want to delay our code action


    //%n da um enter no printf
    //case 1 -> System.out.printf("%.2f%n", number100 + number200;
    //case 2 -> System.out.printf("%.2f%n", number100 - number200);
    //case 3 -> System.out.printf("%.2f%n", number100 / number200);
    //case 4 -> System.out.printf("%.2f%n", number100 * number200);
    //default -> System.out.println("It is an invalid operation");

    // method = a block of reusable code that is executed when called ().

    learningMethod("Dudu");
    System.out.println(square(3));
    System.out.println(cube(2));

    System.out.println("Enter your age:");
    int age = scanner.nextInt();

    if(ageCheck(age)) {
        System.out.println("You may sign up");
    } else {
        System.out.println("You must be 18+ to sign up");
    }

    System.out.println(add(1, 2));

    System.out.println(add(1, 2, 3));

    String bread = "Flat bread";
    System.out.println(pizza(bread));

    scanner.close();
}

static void learningMethod(String bro) {
    System.out.println("Hey " + bro);
}

static double square(double number){
    return number * number;
}

static double cube(double cubeNumber){
    return cubeNumber * cubeNumber * cubeNumber;
}

static boolean ageCheck(int age){
    return age >= 16;
}


// Methods don't know about each other's local variables.
// You need to pass data between them through parameters (or return values).


//overloaded methods = methods that share the same name, but different parameters signature = name + parameters

static double add(double a, double b){
    return a + b;
}

static double add(double a, double b, double c){
    return a + b;
}

static String pizza(String bread){
    return bread + " pizza";
}

static String pizza(String bread, String cheese){
    return cheese + " " + bread + " pizza";
}

// EXAMPLE OF A CLASS VARIABLE
// Local variables comes first
static int x = 3;
