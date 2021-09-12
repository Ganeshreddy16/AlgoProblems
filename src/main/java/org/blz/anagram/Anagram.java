package org.blz.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First String: "+"\nEnter the Second String: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        anagramcalc(s1, s2);
    }

    private static void anagramcalc(String s1, String s2)
    {
        String str1 = s1.replaceAll("", "");
        String str2 = s2.replaceAll("", "");

        if (str1.length() != str2.length())
        {
            System.out.println("The strings are not equal and they are not Anagrams");
        }

        else
        {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);

            if (Arrays.equals(ArrayS1, ArrayS2))
            {
                System.out.println("\n " + s1 + " and " + s2 + " are anagram");
            }
            else
            {
                System.out.println("\n " + s1 + " and " + s2 + " are not anagram");
            }
        }
    }
}
