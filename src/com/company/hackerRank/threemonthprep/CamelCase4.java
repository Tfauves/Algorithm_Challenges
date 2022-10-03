package com.company.hackerRank.threemonthprep;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelCase4 {

    public static void main(String[] args) {
/* Enter your code here.
Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
method and variable names likeThis.
class names LikeThis.
methods must end with () unless split then () must be removed.
S or C split or combine followed by ;
M C or V method class variable followed by ;
if S make sure the first letter is lowercase and split at the camel cased letter.
if C the words will be lowercase, space seperated and need to be combined with the second word capitalized.
Output must be exact (exact spaces and casing).
*/
        Scanner scanner = new Scanner(System.in);

        List<StringBuilder> finalFormatList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            StringBuilder newFormatStr = new StringBuilder();
            String[] cleanInput = input.split(";");
            String operator = cleanInput[0];
            String type = cleanInput[1];
            String strInput = cleanInput[2];

            // System.out.println(Arrays.toString(cleanInput));
            // System.out.println(operator);
            // System.out.println(type);
            // System.out.println(strInput);
            if (operator.equals("S")) {
                if (type.equals("V")) {
                    for (String letter : strInput.split("(?=[A-Z])")) {
                        newFormatStr.append(letter.toLowerCase() + " ");
                    }
//                    System.out.println(newFormatStr);
                    finalFormatList.add(newFormatStr);
                    continue;

                }

                if (type.equals("M")) {
                    for (String letter : strInput.split("(?=[A-Z])")) {
                        newFormatStr.append(letter.toLowerCase().replaceAll("[()]", "") + " ");

                    }
                    finalFormatList.add(newFormatStr);
                }

                if (type.equals("C")) {
                    for (String letter : strInput.split("(?=[A-Z])")) {
                        newFormatStr.append(letter.toLowerCase() + " ");
//                        finalFormatList.add(newFormatStr);
                    }
                    finalFormatList.add(newFormatStr);

                }


                // System.out.println("split at Upper and tolower this");
            }
//             System.out.println(newFormatStr);

            if (operator.equals("C")) {
                if (type.equals("V")) {
                    char[] chStrInput = strInput.toCharArray();
                    String newVal = "";
                    for (int i = 0; i < chStrInput.length; i++) {
                        if (i == 0) {
                            chStrInput[i] = Character.toLowerCase(chStrInput[i]);
                        }
//                        System.out.println(newFormatStr);
                        if (chStrInput[i] == ' ') {
                            chStrInput[i +1] = Character.toUpperCase(chStrInput[i +1]);
                            //    System.out.println(chStrInput);
                            newVal = String.valueOf(chStrInput);
//                            System.out.println(newFormatStr);
//
//
//                            System.out.println(newFormatStr);

                        }
                        if (i == chStrInput.length -1) {
                            newFormatStr.append(newVal.replaceAll("\\s+", ""));
                        }
//                        System.out.println(newFormatStr);
                    }
//                    System.out.println(newFormatStr);
                    finalFormatList.add(newFormatStr);


                }

                if (type.equals("M")) {
                    char[] chStrInput = strInput.toCharArray();
                    for (int i = 0; i < chStrInput.length; i++) {
                        if (i == 0) {
                            chStrInput[i] = Character.toLowerCase(chStrInput[i]);

                        }

                        if (chStrInput[i] == ' ') {
                            chStrInput[i +1] = Character.toUpperCase(chStrInput[i +1]);
                            //    System.out.println(chStrInput);
                            String newVal = String.valueOf(chStrInput);
                            newFormatStr.append(newVal.replaceAll("\\s+", ""));
                            newFormatStr.append("()");
                            finalFormatList.add(newFormatStr);
//                            System.out.println(newFormatStr);
                            break;

                        }

                    }

                }

                if (type.equals("C")) {
                    char[] chStrInput = strInput.toCharArray();
                    for (int i = 0; i < chStrInput.length; i++) {
                        chStrInput[0] = Character.toUpperCase(chStrInput[0]);
                        newFormatStr.append(chStrInput[i]);

                        if (chStrInput[i] == ' ') {
                            newFormatStr.delete(0, newFormatStr.length());
                            chStrInput[i +1] = Character.toUpperCase(chStrInput[i +1]);
                            //    System.out.println(chStrInput);
                            String newVal = String.valueOf(chStrInput);
                            newFormatStr.append(newVal.replaceAll("\\s+", ""));
//                            finalFormatList.add(newFormatStr);
                            break;
                        }

                    }
                    finalFormatList.add(newFormatStr);

                }



                // System.out.println("combine, if var camelCase, if class pascale, if method camelCase and add ()");
            }
//            System.out.println(newFormatStr);


            // System.out.println(input);
//            System.out.println(newFormatStr);

        }
        for (StringBuilder str : finalFormatList) {
            System.out.println(str);
        }


        scanner.close();

    }
//    S;V;iPad
//            C;M;mouse pad
//    C;C;code swarm
//
//    S;C;OrangeHighlighter
}
