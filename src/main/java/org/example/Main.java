package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static String fakeBin(String numberString) {
        if(numberString =="") {
            throw new RuntimeException("can not be empty");
        }
        String[] arrayNumber = numberString.split("");
        String cont = "";
        int[] num = new int[arrayNumber.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(arrayNumber[i]);

            if(num[i]<5){
                num[i] = 0;
            }
            else{
                num[i] = 1;
            }

            cont += Integer.toString(num[i]);
        }
         return cont;
    }

    public static int simpleMultiplication(int n) {

        int result = 0;
        if(n % 2 == 0){
            result = n * 8;
        }
      else{
            result = n * 9;
        }
        return result;
    }

    public class EvenOrOdd {
        public static String even_or_odd(int number) {
            if(number % 2 == 0){
                return "Even";
            }else{
                return "Odd";
            }
        }
    }

    public class BooleanToString {
        public static String convert(boolean b){
            if(b == true) {
                return "true";
            } else {
                return "false";
            }
        }

    }

    public static int summation(int n) {
      int count = 0;
        for (int i = 0; i <= n; i++){
          count += i;
      }
        return count;
    }

    public static boolean check(Object[] a, Object x) {
        boolean result = false;
        for (Object o : a) {
            if (o.equals(x)) {
                return true;
            }
        }
    return result;

    }
    /*public static Integer find(final int[] array) {
        boolean consecutive = true;
        int nonconsecutiveNum = 0;

        if (array.length < 2) {
            throw new RuntimeException("the array must have 2 numbers");
        }
        while(consecutive){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[i + 1]) {
                    throw new IllegalArgumentException("the array can not have 2 equals numbers");
                }
                if (array[i] + 1 != array[i + 1]) {
                    consecutive = false;
                    array[i] = nonconsecutiveNum;
                }
            }
            return null;
        }
        return nonconsecutiveNum;
    }
*/
    public static String areYouPlayingBanjo(String name) {
       String[] nameB = name.split("");
       if(nameB[0].equals("R") || nameB[0].equals("r")){
           return name + " plays banjo";
       }else{
           return name +" does not play banjo";
       }

    }

    public static int paperWork(int n, int m) {
        if(n < 0 || m < 0){
            return 0;
        }
        else{
            return n * m;
        }
    }
/*
Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
StringUtils.toAlternativeString("StringUtils.toAlternatingCase") ==  == "sTRINGuTILS.TOaLTERNATINGcASE"
*/
    public static String toAlternativeString(String string) {
        String[] str = string.split("");
        String a ="";
        for (int i = 0; i < str.length; i++){
            if(str[i].contains("[^0-9]|.")){
                a += str[i];
            }
            else if(str[i].contains(str[i].toUpperCase())){
                a += str[i].toLowerCase();
            }else if(str[i].contains(str[i].toLowerCase())){
                a += str[i].toUpperCase();
            }
        }
        a = a.replace("\\s+", " ");

        return a;
    }

    /*DESCRIPTION:

    Your task is to create a function that does four basic mathematical operations.

    The function should take three arguments - operation(string/char), value1(number), value2(number).
    The function should return result of numbers after applying the chosen operation.
*/
    public static Integer basicMath(String op, int v1, int v2)
    {
        Integer result = 0;

        if(op == "+"){
           result = v1 + v2;
        }
        else if(op == "-"){
            result = v1 - v2;
        }
        else if(op == "*"){
            result = v1 * v2;
        }
        else if(op == "/"){
            result = v1 / v2;
        }
        else{
            throw new IllegalArgumentException("The op is not valid");
        }
       return result;
    }
/*
You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away! You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.

Considering these factors, write a function that tells you if it is possible to get to the pump or not.

Function should return true if it is possible and false if not.
 */
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        Boolean isPosibleToArrive = true;

        if(mpg * fuelLeft >= distanceToPump){
            isPosibleToArrive = true;
        }
        if(mpg * fuelLeft < distanceToPump){
            isPosibleToArrive = false;
        }
        return isPosibleToArrive;
    }

    /*
    Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
    You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
    Be careful, there shouldn't be a space at the beginning or the end of the sentence!
    */
    public static String smash(String... words) {
        String sentence = "";
        for (int i = 0; i < words.length; i++){
            sentence += words[i] + " ";
        }
        return sentence.trim();
    }
     /*
     DESCRIPTION:
Your task is to make a function that can take any non-negative integer as an argument and return it with
its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
      */
     public static int sortDesc(final int num) {

     return 0;  //PENDIENTE
     }

    /*Create a function with two arguments that will return an array of the first n multiples of x.
    Assume both the given number and the number of times to count will be positive numbers greater than 0.
    Return the results as an array or list ( depending on language ).*/

    public static int[] countBy(int x, int n){
        int[] counter = new int[n];
        for (int i = 0; i < n; i++) {
            counter[i] = x * (i + 1);

        }
        return counter;
    }

    /*
    DESCRIPTION:
    Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of
    four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
    Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical
    structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
    Create a function which translates a given DNA string into RNA.
     */

    public static String dnaToRna(String dna) {
        String rna = "";
        String[] dna2 = dna.split("");
        for (int i = 0; i < dna2.length; i++){
            if(dna2[i].contains("T")){
                dna2[i] = "U";
            }
            rna += dna2[i];
        }
        return rna;
    }

    /*Clock shows h hours, m minutes and s seconds after midnight.
    Your task is to write a function which returns the time since midnight in milliseconds.
    */

    public static int Past(int h, int m, int s)
    {
        Integer milisegundos = 0;
        if(h > 0){
            milisegundos += h * 3600000;
        }
        if(m > 0){
            milisegundos += m * 60000;
        }
        if(s > 0){
            milisegundos += s * 1000;
        }
        return milisegundos;
    }

    /*
    In this kata you will create a function that takes a list of non-negative
    integers and strings and returns a new list with the strings filtered out.
     */

    public static List<Object> filterList(final List<Object> list) {
        List<Object> lista = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
        if(list.get(i) instanceof Number){
            lista.add(list.get(i));
        }
    }return lista;
    }

    /*Consider an array/list of sheep where some sheep may be missing from their place.
    We need a function that counts the number of sheep present in the array (true means present).*/

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int numSheeps = 0;

        for(int i = 0; i < arrayOfSheeps.length; i++) {
            if(arrayOfSheeps[i] != null && arrayOfSheeps[i])
                numSheeps += 1;
        }
        return numSheeps;
    }

    /* Given an array of integers your solution should find the smallest integer. */

    public static int findSmallestInt(int[] args) {
        int smallest= args[0];
        for (int i = 1; i < args.length; i++) {
            if (smallest > args[i])
                smallest= args[i];
        }
        return smallest;
    }

    public static void main(String[] args) {
        Object[] ab = new Object[]{1,2,3,4,7};
        int[] aa = new int[]{2,3,4,5,6};

        String hello = "12345";
        System.out.println(fakeBin(hello));
        System.out.println(summation(6));
        System.out.println(check(ab, 3));
        System.out.println(areYouPlayingBanjo("Rocio"));
        System.out.println(toAlternativeString("12345"));
        //System.out.println(find(aa));
        System.out.println(Arrays.toString(countBy(5, 4)));
        System.out.println(dnaToRna("GACTT"));
        System.out.println(Past(1, 3, 6));
        System.out.println(filterList(List.of(1,2,3,"kowsm")));
    }
}